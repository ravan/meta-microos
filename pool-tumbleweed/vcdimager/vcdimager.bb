SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-2.0.1-4.6.aarch64.rpm"
RPM_HASH = "742a68739f2992460379cf1aedf7811a89672a55fc831a11a86821897b8c5417adaaa7cbb2466c2a0b3f97f33c6700b6667c6e2c973d25c3ab01e90683fb8c19"

RPROVIDES:${PN} += "vcdimager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.12 \
libm.so.6 \
libpopt.so.0 \
libvcdinfo.so.0 \
libxml2.so.16"

inherit rpm
