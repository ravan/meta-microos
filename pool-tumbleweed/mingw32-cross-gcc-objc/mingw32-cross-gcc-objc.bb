SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-gcc-objc-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "250ed3dd6be81654f62a5ca441ea2a2a96ccbd84bc5ad1a03aa7e967475f220a3051a336fe0e2652cb8e15f5daded646cd75e3143cf933db2a99427740bce2d4"

RPROVIDES:${PN} += "mingw32-cross-gcc-objc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
