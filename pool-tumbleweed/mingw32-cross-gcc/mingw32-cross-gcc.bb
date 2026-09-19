SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-gcc-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "c33de27c6160f8c1709b6a7a518e3c09a9bd0023e6018a5c4652756e2ac025ba575d6da3bf357a7eeee2b80debfd7080a8244a57a57419a826375409889b6dd6"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw32-cross-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-binutils \
mingw32-cross-cpp \
mingw32-filesystem \
mingw32-headers \
mingw32-runtime"

inherit rpm
