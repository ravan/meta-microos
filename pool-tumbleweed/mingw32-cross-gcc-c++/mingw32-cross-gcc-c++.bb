SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-gcc-c++-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "a598149779abbf3ad7623709b5fc06ea154c25d3133b299a64f8458f2d9a8e0b87dc80233c7330408ee8e779e456c332b246a5883dce543e35ebd1e7c3a8f04e"

RPROVIDES:${PN} += "mingw32-cross-gcc-c++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-gcc"

inherit rpm
