SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-spu-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "feb8d2e6c5082432342c65523bb43f98825e620d54c5cdc87895a1ef93aa3182d5564e9474a7e37da36fe15cbd17edec48cc29bd40d9e9d18d01e14bb5f6ad7d"

RPROVIDES:${PN} += "cross-spu-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
