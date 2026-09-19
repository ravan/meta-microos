# Run dnf inside a user namespace, and let rpm chroot into the image.
#
# Two edits to the wrapper script poky generates around dnf-native. Both are
# skipped when MICROOS_RPM_SCRIPTLETS is "0", which leaves poky's wrapper
# exactly as it was.
#
# 1. Take RPM_NO_CHROOT_FOR_SCRIPTS out.
#
#    rpm chroots before a scriptlet by default. poky's rpm carries a patch that
#    skips the chroot when that variable is set, and poky sets it in the
#    wrapper, because a Yocto-built scriptlet is written to run on the build
#    host and looks at $D to find the rootfs. An openSUSE scriptlet is not
#    written that way - it expects to be inside the system it is configuring.
#
# 2. Run the whole transaction inside a user namespace.
#
#    Edit 1 on its own is not enough, and for a while it was worse than
#    nothing. do_rootfs is a fakeroot task, so rpm's chroot(2) was pseudo's
#    emulated one. pseudo rewrites the paths a program opens; it does not
#    decide which program the kernel starts. Every scriptlet therefore ran the
#    build host's own x86_64 helper against the image's files, and a static
#    helper such as glibc's ldconfig was not even path-bent - it wrote straight
#    to the build host's /etc.
#
#    A user namespace fixes the cause. Inside one the build user is uid 0 for
#    real, so chroot(2) is a real chroot and chown(2) is a real chown, and the
#    binary the kernel starts is the image's own aarch64 one, handed to
#    qemu-aarch64 by binfmt_misc.
#
#    PSEUDO_UNLOAD=1 is on the same line, and has to be. pseudo cannot write a
#    uid map - the kernel refuses the write and unshare exits non-zero - and
#    there is nothing left for it to pretend about inside the namespace.
#
#    The flags, in order: -r maps uid 0 onto the build user, --map-auto maps
#    every other uid onto the build user's subordinate range from /etc/subuid,
#    -m opens a mount namespace so microos-dnf-ns can mount /proc, /sys and
#    /dev without those mounts ever reaching the image, and -p --fork puts the
#    transaction in its own pid namespace so a scriptlet cannot leave a daemon
#    behind.
#
#    What comes out of the namespace is owned by ids in that subordinate range.
#    microos_reconcile_owners in classes/microos-image.bbclass shifts them back
#    and hands them to pseudo.
#
# Only dnf is touched. dnf is the only thing that installs packages here; the
# rpm CLI poky calls afterwards only queries the database.
#
# Both edits are checked rather than applied blind, so this file fails loudly
# if a future poky writes a different wrapper rather than quietly doing
# nothing.
MICROOS_RPM_SCRIPTLETS ?= "auto"

FILESEXTRAPATHS:prepend := "${THISDIR}/../../scripts:"
SRC_URI:append:class-native = " file://microos-dnf-ns"

do_install:append:class-native() {
    if [ "${MICROOS_RPM_SCRIPTLETS}" = "0" ]; then
        return 0
    fi

    if ! grep -q "RPM_NO_CHROOT_FOR_SCRIPTS" ${D}${bindir}/dnf; then
        bbfatal "dnf-native's wrapper no longer sets RPM_NO_CHROOT_FOR_SCRIPTS. Check this bbappend against poky's dnf recipe."
    fi
    sed -i -e 's| *RPM_NO_CHROOT_FOR_SCRIPTS=1||' ${D}${bindir}/dnf

    install -m 0755 ${WORKDIR}/microos-dnf-ns ${D}${bindir}/microos-dnf-ns

    # poky's last line is:  exec -a "$0" $realdir/dnf.real "$@"
    #
    # "-a" is dropped along with it. It only set argv[0] so dnf would print the
    # name it was called by, and the namespace now sits between the two.
    if ! grep -q '^exec -a "\$0" \$realdir/dnf\.real "\$@"$' ${D}${bindir}/dnf; then
        bbfatal "dnf-native's wrapper does not end in the exec line this bbappend rewrites. Check it against poky's dnf recipe."
    fi
    sed -i -e 's|^exec -a "\$0" \$realdir/dnf\.real "\$@"$|exec env PSEUDO_UNLOAD=1 unshare -r --map-auto -m -p --fork \$realdir/microos-dnf-ns \$realdir/dnf.real "\$@"|' \
        ${D}${bindir}/dnf
}
