SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-ppc64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "4402518cedadda8369f746ae0dd3bd923c5e97e11afa5d31539e28d3c30f3bef9cb59d39070255f3dc4a69f4958266590d8a8bd2fdc46307276362b11169feac"

RPROVIDES:${PN} += "cross-ppc64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
