SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-avr-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "ddfd2834bd4a4353baf1431233e438e8fc5951eab8db856d2aa08d3b8c085f06f0608744590bc310b672d46bf76740516bbe9416923ca97e6ad483d1b485998c"

RPROVIDES:${PN} += "cross-avr-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
