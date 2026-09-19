SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-gcc-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "8c02bb0fa3ef518fec23ca2d0ad1a0d2219fc73ecd032e480a2354fa35896622d7b625e0f23c2133f3546c8a2f344eeda850aad2b08e811cae1e56535bdb7cbf"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw64-cross-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-binutils \
mingw64-cross-cpp \
mingw64-filesystem \
mingw64-headers \
mingw64-runtime"

inherit rpm
