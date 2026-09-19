SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-xtensa-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "05f53561839a0529313f321ad09884199b251f0ec0678a0e3c463f65ca9930e0b09f6a6c529ad02f323edfedaa3acb7518b2de45158213f4d7f116e4de96ecc4"

RPROVIDES:${PN} += "cross-xtensa-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
