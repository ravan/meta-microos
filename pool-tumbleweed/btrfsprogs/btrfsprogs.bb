SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain Btrfs file systems under Linux (btrfs, \
mkfs.btrfs, btrfs-convert, btrfs-image, ...)."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "btrfsprogs-7.1-1.2.aarch64.rpm"
RPM_HASH = "f49a84c757dfa6ca7e5360d260fa56ba578d27a38faf7a6811f42bfc5e30681829296fe0ae0eab56428780e17562caa7b55bfb793aace05204469018875b3982"

RPROVIDES:${PN} += "btrfs-progs \
btrfs-progs-aarch64 \
btrfsprogs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
btrfsprogs-udev-rules \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
liblzo2.so.2 \
libudev.so.1 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
