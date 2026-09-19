SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain Btrfs file systems \
under Linux (btrfs, mkfs.btrfs, btrfs-convert, btrfs-image, ...). \
Suitable for limited or rescue environments. \
 \
Warning: the zlib, lzo and zstd libraries are statically linked in and may lack \
important updates as their version is fixed and not linked to system libaries."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "btrfsprogs-static-7.1-1.2.aarch64.rpm"
RPM_HASH = "3a6bbbee90359bf6ff4aabdc3eb41579dc66547c54c0b4d4d66c58bd3b1adfd60e604b77b2e6707c6f8032f06298475ce9a46064c42de22fba353e590a14849e"

RPROVIDES:${PN} += "btrfs-progs-static \
btrfs-progs-static-aarch64 \
btrfsprogs-static"

RDEPENDS:${PN} += ""

inherit rpm
