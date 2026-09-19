SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-cpp-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "6d1d9ce0b80ab2234349397a4916c5e5cedb1a3f46af00704588c05b5e6b5c8c86ea24376d52f5b572d139289882b565d442fe4e51e59bff8f84be166004c9a5"

RPROVIDES:${PN} += "mingw64-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
