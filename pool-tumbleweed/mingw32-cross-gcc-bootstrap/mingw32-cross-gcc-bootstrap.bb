SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-gcc-bootstrap-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "5a1a47ce50bbfeebaad66e5f2ef473486903709c3bfa46509aec249c2a4dbd4731ad0c25708d64f655e1f1b378d1bace14ce26b38c3ff04f8cd881242e5cd10c"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw32-cross-gcc-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-binutils \
mingw32-cross-cpp-bootstrap \
mingw32-filesystem \
mingw32-headers \
mingw32-headers-dummy-pthread"

inherit rpm
