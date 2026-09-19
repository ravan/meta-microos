SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-loongarch64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "284f3e59728c463d498b0e5fb621ba9d431de09406fe821b80b45343925b369f7fbe2c57fa39c000282971754e18713ce5a61f075799556f34e5ee4529c6f1b1"

RPROVIDES:${PN} += "cross-loongarch64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
