SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-mips-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "bd272cce3d0f36caa37460d3fe18a2c45b29a6bb90d04a05e82d5d0b10a5cddb768fb168ef755a1109abfeb165db14cf7a040e7086ec4ba125a322191eaacb87"

RPROVIDES:${PN} += "cross-mips-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
