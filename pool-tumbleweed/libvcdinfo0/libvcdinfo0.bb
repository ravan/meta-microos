SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs. \
This is the core library"
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "libvcdinfo0-2.0.1-4.6.aarch64.rpm"
RPM_HASH = "70fbbb7019a73cb174eba1df48585278f08e0399b71c0afceb84ac0e83b7b2a501e08e4ff696ac7627ff2a0f619b95fabb62d544a93fe3b2fd90aa13ec67fff0"

RPROVIDES:${PN} += "libvcdinfo.so.0 \
libvcdinfo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.12 \
libm.so.6"

inherit rpm
