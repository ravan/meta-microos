SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-devel-2.0.1-4.6.aarch64.rpm"
RPM_HASH = "7cd68027674707f9007765912a4cc14ba6d6297e6a94688717a80c7e60f2521da76e311c5cb11710cd2dee58d8b88462973848fcef17bec08088a4f0a37ba89b"

RPROVIDES:${PN} += "pkgconfig-libvcdinfo \
vcdimager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvcdinfo0 \
pkgconfig-libcdio"

inherit rpm
