SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-arm-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "7a4f9302f6cbf0b54a27ecc28f88307517aa1dc7a07eef26338c61222db2c790ac946294016dd5680ee7e359ec5596bd68c86e27ca0aec045a5690a2c556b9c1"

RPROVIDES:${PN} += "cross-arm-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
