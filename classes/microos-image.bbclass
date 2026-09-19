#
# Build an image whose every file comes from an openSUSE signed RPM.
#
# This is image.bbclass with the Yocto-shaped assumptions removed. Poky expects
# to have built the userspace itself: it installs its own bootstrap packages,
# runs its own postinstall intercepts, and lets rpm execute each package's
# scriptlets. None of that holds when the packages are openSUSE's and the build
# host is a different CPU, so the pieces that do not apply are turned off here
# and the few things they were responsible for are done directly.
#
# Use it instead of core-image.bbclass. core-image pulls packagegroup-core-boot,
# which is poky's own userspace, and that is the one thing this image must not
# contain.
#

inherit image

# The kernel is an openSUSE RPM too, and the bbappend on kernel-default
# publishes the Image it carries. Wait for that, so a finished build has a
# kernel and a rootfs sitting side by side and runqemu can find both.
do_image[depends] += "virtual/kernel:do_deploy"

# image.bbclass inherits populate_sdk_base, whose default target task adds
# packagegroup-core-standalone-sdk-target to the image's own runtime
# dependencies. That packagegroup is poky's SDK: libgcc-dev, libatomic-dev and
# the rest of a Yocto-built toolchain, none of which exists here. The image's
# packages are the only thing an SDK for this image could contain.
TOOLCHAIN_TARGET_TASK = "${PACKAGE_INSTALL}"

# The same for the host half. image.bbclass also defers populate_sdk_ext, which
# makes every image depend on meta-environment-extsdk and, through it, on poky's
# ldconfig, dpkg and python3. Emptying both lists means `bitbake -c populate_sdk`
# cannot produce an SDK for this image, which is the right trade: an SDK for a
# MicroOS image is the openSUSE -devel packages, and that is what
# conf/sysroot-packages.txt and the microos-sysroot toolchain mode already build.
TOOLCHAIN_HOST_TASK = ""

# populate_sdk_ext arrives through image.bbclass's inherit_defer, so it is read
# after this file and its own assignment to TOOLCHAIN_HOST_TASK_ESDK wins.
# An anonymous function runs later still, which is the only place the value can
# be cleared for good.
python () {
    d.setVar("TOOLCHAIN_HOST_TASK_ESDK", "")
    d.setVar("TOOLCHAIN_HOST_TASK", "")
    d.setVar("ROOTFS_PKGMANAGE", "rpm")
}

# poky's bootstrap package. run-postinsts exists to finish Yocto postinstall
# scripts on first boot, and there are no Yocto packages here to finish.
ROOTFS_BOOTSTRAP_INSTALL = ""

# IMAGE_INSTALL is the whole story, with one feature kept.
#
# package-management tells poky to leave the RPM database in the image. Without
# it poky deletes /var/lib/rpm on the way out, because a Yocto image is usually
# a fixed set of packages with nothing to query. Here it is the opposite: the
# claim being made is that every file came from a named, signed openSUSE
# package, and "rpm -qa" inside the running image is how anyone checks that.
# A MicroOS without an RPM database also cannot be updated, which is most of
# what MicroOS is for.
IMAGE_FEATURES = "package-management"

# That feature normally installs poky's own rpm and dnf into the image. openSUSE
# ships rpm already and uses zypper rather than dnf, and poky's dnf would drag
# poky's python3 in with it, so name only the package that is already there.
# rootfs_rpm.bbclass arrives through image.bbclass's inherit_defer and sets this
# itself, so it has to be cleared later than a plain assignment can manage. See
# the anonymous function below.
IMAGE_LINGUAS = ""
IMAGE_INSTALL_COMPLEMENTARY = ""

# The RPMs arrive stripped and their debug symbols ship as separate -debuginfo
# packages, so there is nothing for poky's own splitting to do.
NO_RECOMMENDATIONS = "1"

# ---------------------------------------------------------------- scriptlets

# Let the packages' own install scriptlets run.
#
# An openSUSE scriptlet is a shell or Lua fragment written for a running
# MicroOS. The Lua ones execute inside rpm itself and have always worked. The
# shell ones call systemd-update-helper, pam-config, ldconfig and fillup, which
# are aarch64 programs, so two things have to hold on the build host.
#
# 1. The host kernel must start an aarch64 binary. binfmt_misc hands such a
#    binary to qemu-aarch64. The registration has to carry flag F, which opens
#    the interpreter once, up front, so it still works after rpm has chrooted
#    into the image and qemu-aarch64 is no longer on any path. This is the same
#    mechanism KIWI uses, and "just vm provision" sets it up.
#
# 2. rpm must be able to chroot into the image for real, and to chown the files
#    it unpacks. Under pseudo neither is true. pseudo rewrites the paths a
#    program opens; it does not decide which program the kernel starts. So
#    "chroot $D /usr/bin/bash" under pseudo runs the build host's own x86_64
#    bash with the image's files bent under it, and a statically linked program
#    such as glibc's ldconfig is not path-bent at all - it writes straight to
#    the build host. That was measured, and it is why this used to stay off.
#
#    The answer is a user namespace. Inside one the build user really is uid 0,
#    so chroot(2) is a real chroot and chown(2) is a real chown. The whole dnf
#    transaction moves in there with pseudo unloaded - see the dnf bbappend and
#    scripts/microos-dnf-ns. Every uid a package asks for is mapped onto the
#    build user's subordinate id range from /etc/subuid, and one pass afterwards
#    shifts the owners back and hands them to pseudo.
#
# Neither point is assumed. microos_scriptlet_probe below measures both, once,
# doing exactly what dnf is about to do.
#
#   auto  run them if the probe passes, and say so plainly if it does not
#   1     run them, and fail the build if the probe does not pass
#   0     do not run them - the behaviour this image had before
MICROOS_RPM_SCRIPTLETS ?= "auto"

# Take do_rootfs out of BitBake's no-network sandbox.
#
# BitBake runs most tasks inside a user namespace of its own, with the network
# namespace unshared, so a task cannot reach the internet. It maps exactly one
# id into that namespace: the build user onto itself. bb.utils.disable_network
# is where it happens.
#
# That is one user namespace too many. A nested namespace can only map ids its
# parent already maps, so inside BitBake's the whole subordinate range from
# /etc/subuid is invisible - "unshare --map-auto" gets "newuidmap: write to
# uid_map failed: Operation not permitted", and rpm could not give a file to
# lp or tss even if it got that far. The symptom is confusing, because the same
# command run by hand in the same shell works.
#
# The "network" flag is the only way out: it is what tells BitBake to leave the
# task alone. do_rootfs then can reach the network, which is a real thing to
# give up. It does not use it - every package comes from the local repository
# BitBake assembles in ${WORKDIR}/oe-rootfs-repo, and dnf is pointed at that
# directory and no other.
#
# Only when the scriptlets are actually going to run. With
# MICROOS_RPM_SCRIPTLETS = "0" the task keeps the sandbox it always had.
python () {
    if d.getVar("MICROOS_RPM_SCRIPTLETS") != "0":
        d.setVarFlag("do_rootfs", "network", "1")
}

# What the probe unpacks to get a working aarch64 shell. glibc brings the
# dynamic loader and libc, libncurses6 and libreadline8 bring the two libraries
# bash links against, and bash brings the shell rpm would start. Miss one and
# the shell dies with "error while loading shared libraries" and the probe
# reports a working host as a broken one.
#
# coreutils is here for the third test, which needs touch and chown inside the
# chroot. It is also the set most scriptlets reach for first.
MICROOS_SCRIPTLET_PROBE_PKGS ?= "glibc libncurses6 libreadline8 bash coreutils"

# Read one field of the build user's line in /etc/subuid or /etc/subgid.
#
#   $1  the file to read
#   $2  the build user's name
#   $3  the build user's numeric id
#   $4  field 2 for the first id of the range, field 3 for how many
#
# Both spellings of the user are accepted, because either may be written there.
microos_subid_field () {
    awk -F: -v u="$2" -v n="$3" -v f="$4" \
        '($1 == u || $1 == n) { print $f; exit }' "$1" 2>/dev/null
}

# Measure whether the packages' scriptlets can run. Returns 0 only if all three
# tests pass. Each one is a step dnf itself takes a few minutes later.
microos_scriptlet_probe () {
    probe=${WORKDIR}/scriptlet-probe

    # Every command below is prefixed with PSEUDO_UNLOAD=1, and that is not a
    # detail. pseudo cannot write a uid map - the kernel refuses the write and
    # unshare exits non-zero - and there is nothing left for pseudo to pretend
    # about inside the namespace, where the build user is uid 0 for real.
    #
    # newuidmap and newgidmap must be the build host's own copies. They carry
    # the file capability that writes a map wider than a single id, which is
    # what --map-auto needs. poky's restricted PATH hides them unless the
    # distro conf names them in HOSTTOOLS_NONFATAL.
    for t in unshare newuidmap newgidmap chroot; do
        if ! command -v $t >/dev/null 2>&1; then
            bbwarn "scriptlet probe: $t is not on PATH. Name it in"
            bbwarn "scriptlet probe: HOSTTOOLS_NONFATAL in the distro conf."
            bbwarn "scriptlet probe: Scriptlets stay off."
            return 1
        fi
    done

    user=$(env PSEUDO_UNLOAD=1 id -un)
    uid=$(env PSEUDO_UNLOAD=1 id -u)
    uidbase=$(microos_subid_field /etc/subuid "$user" "$uid" 2)
    gidbase=$(microos_subid_field /etc/subgid "$user" "$uid" 2)

    if [ -z "$uidbase" ] || [ -z "$gidbase" ]; then
        bbwarn "scriptlet probe: $user has no subordinate id range. Without one"
        bbwarn "scriptlet probe: the namespace holds a single id, and the first"
        bbwarn "scriptlet probe: file rpm gives to lp or tss fails. Add"
        bbwarn "scriptlet probe:     $user:100000:65536"
        bbwarn "scriptlet probe: to /etc/subuid and to /etc/subgid - 'just vm"
        bbwarn "scriptlet probe: provision' writes both. Scriptlets stay off."
        return 1
    fi

    # Test 1. Can this user open a namespace at all, with the range mapped?
    if ! why=$(env PSEUDO_UNLOAD=1 unshare -r --map-auto true 2>&1); then
        bbwarn "scriptlet probe: unshare said: $why"
        bbwarn "scriptlet probe: 'unshare -r --map-auto' failed. Either"
        bbwarn "scriptlet probe: unprivileged user namespaces are switched off"
        bbwarn "scriptlet probe: (sysctl user.max_user_namespaces), or newuidmap"
        bbwarn "scriptlet probe: is not the host's setuid copy, or the range in"
        bbwarn "scriptlet probe: /etc/subuid overlaps another user's."
        bbwarn "scriptlet probe: Scriptlets stay off."
        return 1
    fi

    # The probe tree is built and destroyed with pseudo unloaded, from here to
    # the end of this function. Nothing else in the build reads it, so pseudo
    # has no reason to know about it - and glibc ships hardlinked binaries that
    # pseudo tracks one by one, which fills the log with "inode mismatch" for a
    # tree that is about to be deleted again.
    #
    # The namespace is what deletes it: after a run the tree holds a file owned
    # by an id in the subordinate range, which this user cannot chmod from
    # outside.
    env PSEUDO_UNLOAD=1 unshare -r --map-auto rm -rf $probe 2>/dev/null \
        || env PSEUDO_UNLOAD=1 rm -rf $probe 2>/dev/null \
        || true
    env PSEUDO_UNLOAD=1 mkdir -p $probe

    for p in ${MICROOS_SCRIPTLET_PROBE_PKGS}; do
        # Name the architecture. The download directory can hold pools for
        # more than one CPU, and "glibc-[0-9]*.rpm" matched the riscv64 one.
        f=$(ls ${DL_DIR}/$p-[0-9]*.${TARGET_ARCH}.rpm 2>/dev/null | head -1)
        if [ -z "$f" ]; then
            bbwarn "scriptlet probe: no ${TARGET_ARCH} RPM named $p in ${DL_DIR}"
            return 1
        fi
        if ! why=$(env PSEUDO_UNLOAD=1 sh -c "cd $probe && rpm2cpio '$f' | cpio -idmu --quiet" 2>&1); then
            bbwarn "scriptlet probe: could not unpack $f: $why"
            return 1
        fi
    done

    # openSUSE is merged-usr and the filesystem package owns these links. The
    # probe does not unpack it, so make the few the loader needs.
    for l in bin sbin lib lib64; do
        [ -e $probe/$l ] || env PSEUDO_UNLOAD=1 ln -s usr/$l $probe/$l
    done

    # Test 2. Inside the namespace, does chroot start the *image's* shell?
    #
    # bash prints the triplet it was built for, and that string is compiled into
    # the binary, so it names the program that actually ran and no bent path can
    # spoof it. An empty answer means the kernel would not start a foreign
    # binary at all; the host's own triplet means the chroot was not real.
    ran=$(env PSEUDO_UNLOAD=1 unshare -r \
            chroot $probe /usr/bin/bash --version 2>/dev/null | head -1) || true

    case "$ran" in
        *${TARGET_ARCH}*)
            ;;
        "")
            bbwarn "scriptlet probe: the build host could not run a ${TARGET_ARCH}"
            bbwarn "scriptlet probe: binary. Install qemu-linux-user and register"
            bbwarn "scriptlet probe: it with binfmt_misc, flag F - see 'just vm"
            bbwarn "scriptlet probe: provision'. Scriptlets stay off."
            return 1
            ;;
        *)
            bbwarn "scriptlet probe: the chroot ran $ran, not a ${TARGET_ARCH}"
            bbwarn "scriptlet probe: binary, so the chroot was not a real one."
            bbwarn "scriptlet probe: Check that pseudo really unloaded and that"
            bbwarn "scriptlet probe: the namespace was entered."
            bbwarn "scriptlet probe: Scriptlets stay off."
            return 1
            ;;
    esac

    # Test 3. Inside the namespace, does chown reach the subordinate range?
    #
    # rpm chowns nearly every file it unpacks. unshare maps inner uid 0 onto the
    # build user and inner uid 1 onto the first id of the range, so inner uid 5
    # lands on base + 4 on disk. Step 3 of the plan reverses exactly this sum,
    # so getting it wrong here would give the whole image the wrong owners.
    # Absolute paths on purpose. The shell inside the chroot inherits the build
    # task's PATH, and every directory in it - recipe-sysroot-native, hosttools
    # - is outside the chroot and so does not exist. A bare "touch" is not
    # found. rpm sets a sane PATH for a real scriptlet; the probe does not get
    # that for free.
    env PSEUDO_UNLOAD=1 rm -f $probe/probe-chown
    why=$(env PSEUDO_UNLOAD=1 unshare -r --map-auto \
            chroot $probe /usr/bin/bash \
              -c '/usr/bin/touch /probe-chown && /usr/bin/chown 5:5 /probe-chown' 2>&1) || true

    if [ ! -e $probe/probe-chown ]; then
        bbwarn "scriptlet probe: the shell started but wrote nothing, so this"
        bbwarn "scriptlet probe: test proved nothing. It said: $why"
        bbwarn "scriptlet probe: Scriptlets stay off."
        return 1
    fi

    owneruid=$(env PSEUDO_UNLOAD=1 stat -c %u $probe/probe-chown)
    ownergid=$(env PSEUDO_UNLOAD=1 stat -c %g $probe/probe-chown)
    # expr, not $((...)). BitBake parses these functions with its own shell
    # reader, and that reader does not know arithmetic expansion - it stops the
    # build with "NotImplementedError: $((".
    wantuid=$(expr $uidbase + 4)
    wantgid=$(expr $gidbase + 4)

    if [ "$owneruid" != "$wantuid" ] || [ "$ownergid" != "$wantgid" ]; then
        bbwarn "scriptlet probe: chown 5:5 inside the namespace landed on"
        bbwarn "scriptlet probe: $owneruid:$ownergid on disk, and the range in"
        bbwarn "scriptlet probe: /etc/subuid says it should be $wantuid:$wantgid."
        bbwarn "scriptlet probe: The pass that shifts the owners back would be"
        bbwarn "scriptlet probe: wrong for every file. Scriptlets stay off."
        return 1
    fi

    bbnote "scriptlet probe: namespace ok, ${TARGET_ARCH} shell ran in a real"
    bbnote "chroot, chown reached the range at $uidbase"
    return 0
}

# Decide, and write the answer into dnf.conf.
#
# dnf.conf is written when the rootfs object is built, which happens before any
# ROOTFS_PREPROCESS_COMMAND runs, so appending to it here is safe.
microos_rpm_scriptlets () {
    conf=${IMAGE_ROOTFS}${sysconfdir}/dnf/dnf.conf
    install -d ${IMAGE_ROOTFS}${sysconfdir}/dnf

    # Both files are written by microos-dnf-ns, one per dnf run, and read once
    # by microos_reconcile_owners. They live in WORKDIR, not in the image.
    # Clear them here so that a stale pair from the last build cannot be taken
    # for this build's.
    work=$(dirname ${IMAGE_ROOTFS})
    rm -f $work/microos-owners.manifest $work/microos-owners.manifest.bad \
          $work/microos-scriptlets-on

    # poky writes this file empty and passes every option on the command line
    # instead, so the section header has to be added before the first setting or
    # dnf stops with "IniParser: Missing section header at line 1".
    if ! grep -q "^\[main\]" $conf 2>/dev/null; then
        echo "[main]" >> $conf
    fi

    if [ "${MICROOS_RPM_SCRIPTLETS}" = "0" ]; then
        bbnote "package scriptlets are switched off by MICROOS_RPM_SCRIPTLETS"
        echo "tsflags=noscripts" >> $conf
        return 0
    fi

    if microos_scriptlet_probe; then
        bbnote "package scriptlets will run, inside a user namespace"
        # The stamp says the owners are now the namespace's business.
        # microos_reconcile_owners stops the build if it finds the stamp and no
        # manifest, which is what a silently skipped namespace would look like.
        touch $work/microos-scriptlets-on
        microos_buildenv_marker
        return 0
    fi

    if [ "${MICROOS_RPM_SCRIPTLETS}" = "1" ]; then
        bbfatal "package scriptlets were asked for and the probe failed. Read the warnings above, or set MICROOS_RPM_SCRIPTLETS to 'auto'."
    fi

    bbwarn "package scriptlets will not run. The image still boots, because"
    bbwarn "microos_rootfs_setup does the few things they were needed for."
    echo "tsflags=noscripts" >> $conf
}
# No trailing semicolon on any of these names, here or below.
#
# poky splits these variables on whitespace and hashes each name as a variable,
# which is how a change to a function body reaches do_rootfs's signature. A
# name written "microos_rpm_scriptlets;" is looked up with the semicolon
# attached, finds nothing, and hashes as empty - so the function still runs but
# editing it rebuilds nothing, and the image keeps whatever the last build made.
# Every function in this class was written that way and none of them was in the
# signature. poky's own entries have never carried one.
ROOTFS_PREPROCESS_COMMAND =+ "microos_rpm_scriptlets "


# Hand the owners from the namespace to pseudo.
#
# dnf ran outside pseudo, so pseudo knows nothing about the 40000 files it
# wrote. microos-dnf-ns left two things behind: a manifest of the owner, group
# and mode of every file, taken from inside the namespace where those are the
# ids the image wants, and a tree in which every file now belongs to the build
# user on disk. This pass replays the manifest under pseudo. It writes pseudo's
# database only - the files on disk stay with the build user, which is what
# every later step needs to be able to read them.
#
# Python, not shell. It is one process for the whole tree instead of one chown
# per file, it reads the NUL separated manifest without help, and it has no
# arithmetic for BitBake's shell reader to trip over.
# Make pseudo forget the whole rootfs, without losing a single file.
#
# pseudo does not only record what it is told - it answers with it. A file it
# knows is reported with the inode in its database, not the one on disk. A
# stale row is therefore not harmless: the next lstat of that path returns the
# old inode, the operation is filed under it, and when the file that really
# owns that inode comes along, pseudo sees one inode under two names, calls it
# a "path mismatch" and aborts the build:
#
#   path mismatch [2 links]: ino 101201911
#     db  '.../rootfs/bin'  req '.../rootfs/usr/share/ssl/misc'
#
# Nothing is wrong with either file. The inode in the row is the other file's.
#
# Rows go stale here in a way they never do in an ordinary build. poky writes
# dnf.conf, /etc/rpm and an empty rpm database into the rootfs under pseudo and
# reads parts of the tree again between the dnf runs; every dnf run happens
# outside pseudo, in the namespace, and rewrites those files. pseudo is never
# told and keeps the rows, and the kernel hands the freed inodes to whatever
# rpm unpacks next. The poison also spreads: handing the owners over against a
# stale row writes the stale inode into the new row, the database outlives the
# task, and the next build then aborts in its first seconds.
#
# There is no way to ask pseudo to forget. "pseudo -S" answers "Server refused
# shutdown. Remaining client fds: 1" while the task is running, and deleting
# files.db does nothing, because the rows live in the server's memory until it
# exits.
#
# The one operation pseudo does honour is deletion. So the tree is deleted -
# after every file in it has been given a second name outside pseudo:
#
#   cp -al   a second name for every file, and new directories. No data moves,
#            so a 1 GB rootfs costs a second or two.
#   rm -rf   under pseudo, which drops every row for the rootfs as it goes.
#            The files survive, held by the copy.
#   mv       the copy back into place, again outside pseudo.
#
# What comes back is the same tree, with the same inodes for files, and pseudo
# has never heard of any of it. The manifest then gives it the whole thing.
def microos_pseudo_forget_rootfs(rootfs, d):
    import os
    import shutil
    import subprocess

    unloaded = dict(os.environ, PSEUDO_UNLOAD="1")
    stash = rootfs.rstrip("/") + ".pseudo-stash"

    subprocess.check_call(["rm", "-rf", stash], env=unloaded)
    subprocess.check_call(["cp", "-al", rootfs, stash], env=unloaded)

    # Under pseudo, on purpose. This is the line that empties the database.
    shutil.rmtree(rootfs)

    subprocess.check_call(["mv", stash, rootfs], env=unloaded)

python microos_reconcile_owners () {
    import os
    import stat

    rootfs = d.getVar("IMAGE_ROOTFS")
    work = os.path.dirname(rootfs.rstrip("/"))
    manifest = os.path.join(work, "microos-owners.manifest")
    bad = manifest + ".bad"

    # No stamp means the probe said no, or the scriptlets are switched off. The
    # rootfs was then built by pseudo in the usual way and already has the
    # owners it should.
    if not os.path.exists(os.path.join(work, "microos-scriptlets-on")):
        return

    if os.path.exists(bad):
        with open(bad) as f:
            listed = f.read().strip()
        bb.fatal("the image holds files no one in the namespace owns, so "
                 "something outside it wrote into the image:\n%s" % listed)

    if not os.path.exists(manifest):
        bb.fatal("the scriptlets ran but %s is missing, so the owner of every "
                 "file in the image is unknown. Check that the dnf wrapper "
                 "still calls microos-dnf-ns." % manifest)

    with open(manifest, "rb") as f:
        blob = f.read()

    microos_pseudo_forget_rootfs(rootfs, d)
    bb.note("pseudo has forgotten the rootfs - the manifest is now its only "
            "source for it")

    records = []
    for record in blob.split(b"\0"):
        if not record:
            continue
        fields = record.split(b" ", 7)
        if len(fields) != 8:
            bb.fatal("%s holds a line this function cannot read: %r"
                     % (manifest, record[:120]))
        records.append((int(fields[0]), int(fields[1]), int(fields[2], 8),
                        fields[3], int(fields[4]), (fields[5], fields[6]),
                        os.fsdecode(fields[7])))

    # The hardlinks have to be handled first, and this is why.
    #
    # pseudo knows a file by its inode. The moment it is told about an inode it
    # remembers the one name it was told, and any later call naming that same
    # inode differently is a "path mismatch" that stops the build with an
    # abort. In an ordinary build there is no mismatch, because the program
    # that made the second name called link() with pseudo loaded and pseudo
    # wrote both names down. rpm made these links inside the namespace with
    # pseudo unloaded, so pseudo has to be taught them - and it cannot be
    # taught after it has met the inode, because the teaching itself names the
    # inode twice.
    #
    # So: delete every second name while pseudo still knows nothing about the
    # inode, then set the owner on the first name, then link the second names
    # back. glibc and coreutils bring about a hundred of these.
    first = {}
    extra = []
    gone = 0
    for uid, gid, mode, kind, links, key, path in records:
        if kind != b"f" or links < 2:
            continue
        if key not in first:
            first[key] = path
            continue
        try:
            os.unlink(path)
            extra.append((key, path))
        except FileNotFoundError:
            gone += 1

    dropped = set(path for key, path in extra)

    # The mode is handed over as well as the owner. A change of owner can drop
    # the setuid, setgid and sticky bits, and microos-dnf-ns gave the owner
    # write access back to the fifty-odd directories openSUSE ships as 0555 so
    # that the next build can delete this rootfs. pseudo's chmod records the
    # mode the image should have and keeps the file usable on disk, which is
    # what every other Yocto build relies on.
    setidbits = stat.S_ISUID | stat.S_ISGID | stat.S_ISVTX

    applied = 0
    setid = 0
    for uid, gid, mode, kind, links, key, path in records:
        if path in dropped:
            continue
        try:
            os.lchown(path, uid, gid)
            applied += 1
            if kind != b"l":
                os.chmod(path, mode)
                if mode & setidbits:
                    setid += 1
        except FileNotFoundError:
            gone += 1

    for key, path in extra:
        os.link(first[key], path)

    if gone:
        bb.warn("%d files were in the manifest and are no longer on disk. They "
                "keep whatever owner pseudo has for them." % gone)

    bb.note("owners and modes handed to pseudo: %d files, %d of them setuid, "
            "setgid or sticky, %d hardlink names made again"
            % (applied, setid, len(extra)))
}
RPM_POSTPROCESS_COMMANDS =+ "microos_reconcile_owners "

# --------------------------------------------------------------- /.buildenv

# Tell the scriptlets they are running in an image builder, not on a machine.
#
# openSUSE's own scriptlets ask. suse-kernel-rpm-scriptlets, which is what
# kernel-default's %pre, %post and %posttrans all run, tests for /.buildenv and
# /image/config.xml - the two files KIWI leaves in a rootfs it is assembling -
# and behaves differently when it finds one. Without the marker it assumed it
# was configuring a running system, so:
#
#   * create_boot_symlinks refused to make /boot/Image and /boot/initrd,
#     because an initrd it could point at does not exist yet, and printed
#     "ERROR: cannot create symlinks /boot/Image and /boot/initrd";
#   * update_bootloader_entry asked for a boot loader to be installed.
#
# Neither is a fault. There is no initrd because dracut is not in this image,
# and there is no boot loader because the image is a cpio the kernel unpacks
# itself. With the marker the kernel scriptlet takes KIWI's path: it makes both
# symlinks and says nothing. /boot/initrd is left dangling on purpose - that is
# the name dracut writes to on a first boot, and it is exactly what a KIWI
# built openSUSE image ships.
#
# The marker is written before the install and deleted after it, so it is a
# fact about the build and never about the image. regenerate-initrd-posttrans
# reads it too, and weak-modules2 already prints its "run dracut as soon as
# your system is complete" line either way, because this rootfs has no
# /etc/fstab.
microos_buildenv_marker () {
    : > ${IMAGE_ROOTFS}/.buildenv
}

# Take it away again. Nothing in the image may see it.
microos_drop_buildenv_marker () {
    rm -f ${IMAGE_ROOTFS}/.buildenv
}
ROOTFS_POSTPROCESS_COMMAND =+ "microos_drop_buildenv_marker "

# The scriptlet messages that are expected, and why each one is.
#
# poky reads the do_rootfs log afterwards and fails the task on anything that
# looks like an error. With the scriptlets running, two of them are the image
# telling the truth about itself rather than a fault:
#
#   pam_pwquality       pam-config writes a disabled entry for a module this
#                       image does not install. Nothing uses it.
#   %posttrans(rpm)     "legacy rpmdb location detected". rpm-native writes the
#                       database to /var/lib/rpm, which openSUSE stopped using;
#                       microos_rpm_db_location moves it to
#                       /usr/lib/sysimage/rpm a few seconds later, in this same
#                       task. The scriptlet is right, and it is early.
#
# Each entry is a regular expression, and BitBake splits this variable on
# spaces, so they cannot contain one.
IMAGE_LOG_CHECK_EXCLUDES += "pam_pwquality"
IMAGE_LOG_CHECK_EXCLUDES += "POSTTRANS.scriptlet.in.rpm.package.rpm"
IMAGE_LOG_CHECK_EXCLUDES += "%posttrans.rpm-"

# ------------------------------------------------------------ what they did

# The minimum the scriptlets are responsible for, done again as a safety net.
#
# Step 6 of docs/plan-scriptlets-userns.md asked whether this can go now that
# the scriptlets run. It cannot, and it costs nothing. Measured on the image
# this layer builds with the scriptlets on:
#
#   /etc/passwd      3 lines, not the one line below
#   /etc/group      21 lines, not the four below, and "lp" is among them
#   /etc/shadow      3 lines, not the one line below
#   /etc/machine-id  present, mode 644 - the scriptlet's, not the 444 below
#
# So every test below is already false and the function writes nothing. It
# stays because the probe above can decide the host cannot open a user
# namespace, and an image that does not boot at all is a much worse answer than
# one assembled without the scriptlets. `just image-scriptlets` prints the same
# four measurements against a built image.
#
# Only root has to exist before boot. systemd-sysusers runs early on the first
# boot and creates every other account from /usr/lib/sysusers.d, which the
# packages ship, so building a full passwd file here would only duplicate it.
#
# /init is not a scriptlet's job at all. An initramfs is started by running it
# and no openSUSE package provides that name, so it is written either way, and
# it is not counted as a stand-in below.
microos_rootfs_setup () {
    install -d ${IMAGE_ROOTFS}${sysconfdir}
    stood_in=

    # system-user-root's Lua preinstall scriptlet writes these three files.
    if [ ! -e ${IMAGE_ROOTFS}${sysconfdir}/passwd ]; then
        echo 'root:x:0:0:root:/root:/bin/bash' > ${IMAGE_ROOTFS}${sysconfdir}/passwd
        chmod 644 ${IMAGE_ROOTFS}${sysconfdir}/passwd
        stood_in="$stood_in passwd"
    fi
    if [ ! -e ${IMAGE_ROOTFS}${sysconfdir}/group ]; then
        printf 'root:x:0:\nshadow:x:15:\ntrusted:x:42:\nusers:x:100:\n' \
            > ${IMAGE_ROOTFS}${sysconfdir}/group
        chmod 644 ${IMAGE_ROOTFS}${sysconfdir}/group
        stood_in="$stood_in group"
    fi
    if [ ! -e ${IMAGE_ROOTFS}${sysconfdir}/shadow ]; then
        echo 'root::20000::::::' > ${IMAGE_ROOTFS}${sysconfdir}/shadow
        chmod 640 ${IMAGE_ROOTFS}${sysconfdir}/shadow
        stood_in="$stood_in shadow"
    fi

    # systemd's postinstall makes this an empty file on purpose. An empty
    # machine-id tells systemd to generate one on first boot, and a missing one
    # makes systemd refuse to start in some configurations.
    if [ ! -e ${IMAGE_ROOTFS}${sysconfdir}/machine-id ]; then
        : > ${IMAGE_ROOTFS}${sysconfdir}/machine-id
        chmod 444 ${IMAGE_ROOTFS}${sysconfdir}/machine-id
        stood_in="$stood_in machine-id"
    fi

    install -d ${IMAGE_ROOTFS}/var/log/journal

    # An initramfs is started by running /init, and nothing in the RPMs provides
    # that name. /sbin/init is systemd.
    if [ ! -e ${IMAGE_ROOTFS}/init ]; then
        ln -s sbin/init ${IMAGE_ROOTFS}/init
    fi

    # Say it out loud. With the scriptlets on this list is always empty, so a
    # name in it means a package did not configure itself and the image is the
    # weaker one, whatever the probe reported.
    if [ -n "$stood_in" ]; then
        bbwarn "the scriptlets did not write:$stood_in. microos_rootfs_setup stood in for them."
    fi
}
ROOTFS_POSTPROCESS_COMMAND += "microos_rootfs_setup "

# --------------------------------------------------------------- ld.so.cache

# poky's own ldconfig pass is kept, and this is the measurement that says so.
#
# glibc's %post runs the image's own aarch64 ldconfig inside the chroot and
# writes /etc/ld.so.cache. poky then runs ldconfig-native - glibc 2.12.1 - over
# the same tree in oe.rootfs._run_ldconfig and overwrites it. Step 6 of
# docs/plan-scriptlets-userns.md asked whether to switch that off with
# LDCONFIGDEPEND = "".
#
# The two caches were compared. Both carry the same header, glibc-ld.so.cache1.1,
# and list the same 82 libraries at the same paths. The only difference is that
# openSUSE's ldconfig 2.44 appends a cache extension section - the format glibc
# gained in 2.32 - holding its own version string and, where a distribution uses
# them, the glibc-hwcaps subdirectories. This image ships no glibc-hwcaps
# directory at all, so the section carries nothing the loader here would read.
#
# So poky's pass costs nothing and buys the fallback image a cache, which is the
# build where no scriptlet ran and nothing else would write one. It stays.

# ---------------------------------------------------------------- unit state

# systemd's presets decide which units start, and openSUSE ships them in
# systemd-presets-branding-MicroOS. poky's systemd_preset_all applies them with
# the build host's systemctl, which only reads and writes unit files and never
# executes a target binary, so it works across architectures and is kept.
SYSTEMD_DEFAULT_TARGET ?= "multi-user.target"

# poky ships its own systemctl for exactly this: a Python reimplementation that
# reads unit and preset files and writes the enable symlinks, without running a
# target binary or trusting whatever systemd the build host happens to have.
# Nothing here inherits systemd.bbclass, which is what normally pulls it in, so
# name it directly.
do_image[depends] += "systemd-systemctl-native:do_populate_sysroot"

# A serial console is the only console a board or a QEMU run is guaranteed to
# have, so make sure one is enabled whatever the presets decided.
microos_enable_serial_getty () {
    unitdir=${IMAGE_ROOTFS}${systemd_system_unitdir}
    wants=${IMAGE_ROOTFS}${sysconfdir}/systemd/system/getty.target.wants
    # SERIAL_CONSOLES is "115200;ttyAMA0 115200;hvc0". The semicolons have to be
    # inside quotes before the shell sees them, or they read as command
    # separators and BitBake fails to parse the function at all.
    consoles="${SERIAL_CONSOLES}"

    if [ -e $unitdir/serial-getty@.service ]; then
        install -d $wants
        for tty in $consoles; do
            device=$(echo "$tty" | cut -d";" -f2)
            ln -sf ${systemd_system_unitdir}/serial-getty@.service \
                $wants/serial-getty@$device.service
        done
    fi
}
ROOTFS_POSTPROCESS_COMMAND += "microos_enable_serial_getty "

# Let the serial console log in without a password, when asked for.
#
# openSUSE's PAM does not accept an empty password, so the usual Yocto trick of
# shipping a blank root entry gets "Login incorrect" and the image looks broken
# when it is not. An image meant to be booted under QEMU to show that it works
# needs a way in, and autologin is the one that does not put a guessable
# password in the image.
#
# Off unless the image recipe asks for it. Anything built to run on a real board
# should leave it off and install a key or a password instead.
MICROOS_SERIAL_AUTOLOGIN ?= "0"

microos_serial_autologin () {
    if [ "${MICROOS_SERIAL_AUTOLOGIN}" != "1" ]; then
        return 0
    fi

    consoles="${SERIAL_CONSOLES}"
    for tty in $consoles; do
        device=$(echo "$tty" | cut -d";" -f2)
        dropin=${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@$device.service.d
        install -d $dropin
        printf '[Service]\nExecStart=\nExecStart=-/usr/sbin/agetty --autologin root --noclear %%I $TERM\n' \
            > $dropin/autologin.conf
    done
}
ROOTFS_POSTPROCESS_COMMAND += "microos_serial_autologin "

# Put the RPM database where openSUSE's rpm looks for it.
#
# openSUSE moved the database to /usr/lib/sysimage/rpm years ago and ships
# /var/lib/rpm as a symlink to it. poky's dnf runs with rpm-native's macros, which
# still say /var/lib/rpm, and it replaces that symlink with a real directory.
# The result boots and runs but "rpm -qa" inside it answers zero, because the
# rpm in the image is reading an empty directory a few paths away.
#
# This runs last on purpose. Everything else in do_rootfs that inspects the
# installed set - the manifest, the license list - goes through rpm-native and
# expects the database where dnf left it.
microos_move_rpmdb () {
    written=${IMAGE_ROOTFS}/var/lib/rpm
    expected=${IMAGE_ROOTFS}/usr/lib/sysimage/rpm

    if [ -d $written ] && [ ! -L $written ]; then
        install -d $expected
        cp -a $written/. $expected/
        rm -rf $written
        ln -s ../../usr/lib/sysimage/rpm $written
        bbnote "moved the RPM database to /usr/lib/sysimage/rpm"
    fi
}
ROOTFS_POSTPROCESS_COMMAND:append = " microos_move_rpmdb"
