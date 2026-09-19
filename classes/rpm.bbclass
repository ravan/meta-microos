REPO_URL ?= "https://download.opensuse.org/ports/aarch64/tumbleweed/repo/oss"
# This part correspond to the last bit of the repository URL.  Possibe
# values are "aarch64", "noarch"
REPO_ARCH ?= "aarch64"

SRC_URI = "${REPO_URL}/${REPO_ARCH}/${RPM_NAME};subdir=unrpm"
SRC_URI[sha512sum] = "${RPM_HASH}"

S = "${WORKDIR}/unrpm"

# Remove pkgconfig from RDEPENDS.  One option is to do that during the
# ".bb" generation (microos script). See providers.inc.
RDEPENDS:${PN}:remove = "pkgconfig"

# Drop subpackages, as defined in bitbake.conf
PACKAGES = "${PN}"
FILES:${PN} = "/*"

# Tell BitBake the name the package really has.
#
# scripts/microos names each recipe after the lower-cased package, because that
# is what BitBake accepts as a PN: MicroOS-release becomes microos-release and
# libgcc_s1 becomes libgcc-s1. The RPM in the repository keeps its own spelling,
# so asking dnf to install "microos-release" fails with "No match for argument".
#
# PKG is the variable that carries the shipped name, and poky already translates
# PACKAGE_INSTALL, RDEPENDS and the rest through it just before do_rootfs runs.
# Setting it here means the dependency graph can keep using BitBake spelling
# while the package manager sees openSUSE's.
#
# The name is taken from the RPM file name, which is <name>-<version>-<release>.
# <arch>.rpm. Neither version nor release may contain a dash, so cutting the last
# two fields leaves exactly the name however many dashes it has.
# Most package names survive the lower-casing unchanged, and poky rejects a
# rename to the name a package already has, so only set PKG when it differs.
python () {
    pn = d.getVar("PN")
    name = d.getVar("RPM_NAME").rsplit(".rpm", 1)[0].rsplit("-", 2)[0]
    if name == pn:
        return

    d.setVar("PKG:%s" % pn, name)

    # Drop the BitBake spelling from RPROVIDES, or the rename is ignored.
    #
    # scripts/microos writes every provided name through the same normaliser it
    # uses for recipe names, so the recipe for aaa_base ends up claiming to
    # provide "aaa-base". poky's get_package_mapping treats a package that
    # provides its own pre-rename name as one that does not need renaming, and
    # returns the old name. dnf is then asked for "aaa-base", which no RPM in
    # the repository provides, and the rootfs fails with "No match for argument".
    #
    # Removing the alias costs nothing. BitBake resolves the recipe by PN either
    # way, and every RDEPENDS on it goes through this same rename.
    key = "RPROVIDES:%s" % pn
    provides = (d.getVar(key) or "").split()
    if pn in provides:
        d.setVar(key, " ".join(p for p in provides if p != pn))
}


# Keep packages that contain no files.
#
# "permissions" and every patterns-* package exist only to pull others in through
# their RDEPENDS. poky drops a package with no files from PACKAGES, so no package
# data is written for it, and the image's license manifest then dies looking for
# pkgdata/runtime-reverse/permissions after dnf has installed the RPM quite
# happily. An empty package is a normal thing in an RPM distribution.
ALLOW_EMPTY:${PN} = "1"

# QA complains that binaries are already stripped
INSANE_SKIP:${PN} += "already-stripped"

# debian.bbclass renames any package holding a shared library, for example
# libfoo1 -> libfoo. These packages must keep the exact openSUSE name, or nothing
# resolves against the real repository any more. The renaming also runs
# <target>-objdump, which INHIBIT_DEFAULT_DEPS keeps out of the sysroot, so it
# fails outright as soon as ${libdir} is the directory the RPMs actually use.
AUTO_LIBNAME_PKGS = ""

# The RPMs come from openSUSE already stripped, and debug symbols ship in
# separate -debuginfo packages. Splitting them again needs the cross objcopy,
# which INHIBIT_DEFAULT_DEPS keeps out of the sysroot, so do_package dies on
# anything carrying symbols (glibc). Nothing to split, so turn it off.
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

# Prevents the default dependencies (like glibc) to be automatically
# added to DEPENDS
INHIBIT_DEFAULT_DEPS = "1"

# Do not own "/usr" or "/usr/bin". In MicroOS the filesystem package owns them.
# "None" stands for a directory path that cannot exist.
#
# This belongs here and not in the distro conf. Any non-empty DIRFILES sends
# package_rpm.bbclass down a branch where walk_files calls get_attr with a path
# already relative to the directory being walked, and it stats "<dir>//usr",
# which does not exist. The recipes in this layer never reach that code, because
# do_package_write_rpm below just copies the original openSUSE RPM. Recipes that
# really do build a new RPM would hit it, so they keep the Yocto default.
DIRFILES = "None"

# Make sure that sysroot gets deployed with all relevant directories.
# Do not include ${base_libdir}64, as this is converted as a directory
# by the filesystem package, and the link should be created as a
# preparation task in the glibc recipe.
SYSROOT_DIRS += "${libdir}64"

# Also includes the source directory, for kernel development
SYSROOT_DIRS += "${exec_prefix}/src"

do_install () {
    install -d ${D}

    # Some openSUSE packages carry no files at all. "permissions" and every
    # patterns-* package exist only to pull other packages in through their
    # RDEPENDS, so the unpacked RPM is an empty directory and "cp ${S}/*" fails
    # on the glob. Nothing to install is a normal outcome here, not an error.
    if [ -n "$(ls -A ${S} 2>/dev/null)" ]; then
        cp -a ${S}/* ${D}
        # The fetch task calls rpm2cpio.sh under the normal user.  Should
        # be set to root (via fakeroot) to avoid QA complains
        chown -R root:root ${D}/*
    else
        bbnote "${PN} contains no files - it is a meta package"
    fi
}

do_package_write_rpm () {
    # Copy the original RPM into deploy-rpm instead of generating a
    # new open based on the install task.  Do not avoid the package
    # task, as this is the one that creates the sstage data
    cp ${DL_DIR}/${RPM_NAME} ${PKGWRITEDIRRPM}/${PACKAGE_ARCH_EXTEND}
}

do_compile[noexec] = "1"
do_package_qa[noexec] = "1"

# do_populate_lic used to be switched off here, which is fine while the layer
# only builds single packages and breaks as soon as an image is assembled:
# do_populate_lic_deploy walks every package in the image and stops at the first
# one with no license directory, which was all of them.
#
# The task has nothing to extract - these recipes have no source and no
# LIC_FILES_CHKSUM - so all it does is copy the generic text for the license the
# RPM declares. openSUSE's license strings are not always poky's, and the two
# this layer had to add itself are in licenses/.
#
# The QA check that follows the task insists on LIC_FILES_CHKSUM for any recipe
# that fetches something. It exists to catch a licence changing under you between
# upstream releases, and it cannot apply here: there is no source tree to
# checksum, the licence text ships inside the RPM at
# /usr/share/licenses/<package>/, and the RPM carries openSUSE's signature over
# the whole payload. A checksum of a file unpacked from a signed archive adds
# nothing the signature does not already say.
ERROR_QA:remove = "license-checksum"

# Let do_unpack clear its own previous output.
#
# Several packages ship read-only directories: the filesystem package owns
# /usr/share/man with mode 0555, for example. Removing a file needs write
# permission on the directory holding it, so the second unpack of such a package
# fails with a screenful of "rm: cannot remove ...: Permission denied" and the
# recipe can only be built once.
#
# This runs before the task, so it relaxes the tree that is about to be deleted
# and never the one that is about to be created. The modes that reach the image
# are the ones the RPM ships.
microos_unlock_stale_unpack () {
    if [ -d ${WORKDIR}/unrpm ]; then
        chmod -R u+w ${WORKDIR}/unrpm
    fi
}
do_unpack[prefuncs] += "microos_unlock_stale_unpack"
