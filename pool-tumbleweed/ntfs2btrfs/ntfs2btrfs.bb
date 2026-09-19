SUMMARY = "In-place conversion tool from NTFS to BTRFS"
DESCRIPTION = "Ntfs2btrfs is a tool which does in-place conversion of Microsoft's NTFS \
filesystem to the open-source filesystem Btrfs, much as btrfs-convert does for \
ext2. The original image is saved as a reflink copy at image/ntfs.img, and if \
you want to keep the conversion you can delete this to free up space."
LICENSE = "GPL-2.0-only"

PV = "20240115"

RPM_NAME = "ntfs2btrfs-20240115-2.8.aarch64.rpm"
RPM_HASH = "a213eabf4b8aa1aa472644618036d3821e0a00d66980e3d5a8c84357b7e5d688eb950d1d36c0f9c627e284dd619ad9579c033856a4dc08a2d19313da47e44e4a"

RPROVIDES:${PN} += "ntfs2btrfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzo2.so.2 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
