SUMMARY = "KIWI - host requirements for filesystems"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build filesystem images"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-filesystems-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "6d2925d7be42547f0dd0899d3bc764875b49dda2945d73c43d1b3d685448eec37867d96e299fa4ebfd89c73c1f24eb5260ac86a619e8448b92d277b2fa1bb9fb"

RPROVIDES:${PN} += "kiwi-filesystem-btrfs \
kiwi-filesystem-erofs \
kiwi-filesystem-ext2 \
kiwi-filesystem-ext3 \
kiwi-filesystem-ext4 \
kiwi-filesystem-requires \
kiwi-filesystem-squashfs \
kiwi-filesystem-xfs \
kiwi-image-erofs \
kiwi-image-kis \
kiwi-image-pxe \
kiwi-image-pxe-requires \
kiwi-systemdeps-filesystems"

RDEPENDS:${PN} += "btrfsprogs \
dosfstools \
e2fsprogs \
erofs-utils \
kiwi-systemdeps-core \
qemu-tools \
squashfs \
xfsprogs"

inherit rpm
