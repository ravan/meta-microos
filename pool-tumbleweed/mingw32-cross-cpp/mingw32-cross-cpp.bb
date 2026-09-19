SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-cpp-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "03c26b33c550c275851352c31397377f43654ec1afd5940832abd2ba573531d11037dec171a0ca309763d424c6c7ae90effa22423ee40ab808dc04d98a27a7ff"

RPROVIDES:${PN} += "mingw32-cross-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
