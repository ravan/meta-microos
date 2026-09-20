SUMMARY = "The smallest image that runs our own program and lets you check that it did"
DESCRIPTION = "Four packages. openSUSE's filesystem and glibc, openSUSE's static \
busybox, and hello-learn, which BitBake builds here. There is no systemd, no \
shell from bash, no coreutils and no package manager left in the image: /init \
runs hello-learn and then hands the serial console to busybox. \
\
It is the userspace half of the pair with linux-suse-tiny. Together they answer \
how small a bootable openSUSE-derived system gets while every file still comes \
from openSUSE's own RPMs."
LICENSE = "MIT"

# The list is spelled BitBake's way, as everywhere else in this layer.
# rpm.bbclass turns each name back into openSUSE's spelling before dnf sees it.
MICROOS_IMAGE_PACKAGES = "\
    filesystem \
    glibc \
    busybox-static \
"

IMAGE_INSTALL = "${@' '.join(sorted(p.lower().replace('_', '-') for p in d.getVar('MICROOS_IMAGE_PACKAGES').split()))}"

# A cpio the kernel unpacks into its own rootfs. Nothing has to be mounted, so
# no block layer and no disk filesystem is needed in the kernel at all - see
# recipes-kernel/linux-suse-tiny/files/tiny.cfg.
IMAGE_FSTYPES = "cpio.gz"

inherit microos-image

IMAGE_INSTALL:append = " hello-learn"

# Leave the package manager out of the image.
#
# microos-image.bbclass asks for "package-management", which keeps rpm and the
# database it reads in the finished rootfs so the image can install packages of
# its own later. This image cannot: it has no network stack and no writable
# store. Dropping the feature takes rpm and everything only rpm needed - lua,
# popt, libgcrypt, libzstd, libbz2, libselinux - out with it.
IMAGE_FEATURES = ""

# No dracut in this image and no disk to mount, so there is nothing to build an
# initrd for. The image is the initrd.
MICROOS_INITRD = "0"

# There is no systemd here, so there is no getty to log in on.
MICROOS_SERIAL_AUTOLOGIN = "0"

# Write /init before the class does.
#
# microos-image.bbclass points /init at sbin/init, which is systemd. This image
# has no systemd, so /init is the whole of its userspace policy: mount the two
# pseudo filesystems a shell expects, run the program the image exists for, and
# then give the console to busybox so the result can be checked by hand.
#
# =+ puts this ahead of the class's own microos_rootfs_setup, which only creates
# /init when it is missing.
microos_tiny_init () {
    bb=/usr/bin/busybox-static

    # busybox picks its applet from argv[0], so a symlink named sh is a shell.
    ln -sf $bb ${IMAGE_ROOTFS}${base_bindir}/sh

    cat > ${IMAGE_ROOTFS}/init <<'EOF'
#!/bin/sh
/usr/bin/busybox-static mount -t proc  proc /proc
/usr/bin/busybox-static mount -t sysfs sys  /sys

echo
echo "=============== hello-learn ==============="
/usr/bin/hello-learn
echo "exit status: $?"
echo

echo "=============== what is running it ==============="
/usr/bin/busybox-static uname -a
echo "kernel modules loadable: $(/usr/bin/busybox-static ls /proc/modules >/dev/null 2>&1 && echo yes || echo "no - CONFIG_MODULES is off")"
echo "loader:"
/usr/bin/busybox-static ls -l /lib/ld-linux-aarch64.so.1 2>/dev/null || \
/usr/bin/busybox-static ls -l /usr/lib/ld-linux-aarch64.so.1 2>/dev/null || \
echo "  none at either path"
echo "memory:"
/usr/bin/busybox-static free
echo

echo "=============== shell ==============="
echo "type 'poweroff -f' to stop the machine."
exec /bin/sh
EOF
    chmod 0755 ${IMAGE_ROOTFS}/init
}
ROOTFS_POSTPROCESS_COMMAND =+ "microos_tiny_init "
