SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-hppa64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "c1d880a5c4dd41de019e6320a49fe6a195ccd44864a4628eddfed909a8f466d123e54e67a9af83d4220f3c02d3f075309bd025b955e149b0bef2b57525281c7a"

RPROVIDES:${PN} += "cross-hppa64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
