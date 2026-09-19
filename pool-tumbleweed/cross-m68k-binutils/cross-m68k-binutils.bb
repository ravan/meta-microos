SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-m68k-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "360caa4c000c74c7863cbef898760a073c0da22a3046abf33a07dc43fcd08e4be05ddfdc9d9c317846d6198d0b18b8a6e6e869c474bc93cb646088135e97547d"

RPROVIDES:${PN} += "cross-m68k-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
