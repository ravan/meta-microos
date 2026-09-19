SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-gcc-c++-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "efa8ec52486b5a2ce5d1aa93014c5f2365b6bf31912245bb014107ef209ea188354c5340a7fdc0fbfc46c4bb3865d21022d20e1b80829149d25ac628d33756d1"

RPROVIDES:${PN} += "mingw64-cross-gcc-c++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-gcc"

inherit rpm
