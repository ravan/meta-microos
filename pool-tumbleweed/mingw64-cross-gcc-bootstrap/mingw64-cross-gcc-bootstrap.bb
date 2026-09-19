SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-gcc-bootstrap-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "9aee7e6d0cac9c880950b556b8757a43e69838f1e134e90e785467787beb22fc401bc18b66c7ac497943f2f60f7645cfe4ec5ba745b1a433aefd865a26decf11"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw64-cross-gcc-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-binutils \
mingw64-cross-cpp-bootstrap \
mingw64-filesystem \
mingw64-headers \
mingw64-headers-dummy-pthread"

inherit rpm
