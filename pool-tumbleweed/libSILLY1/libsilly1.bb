SUMMARY = "Simple Image Loading LibrarY"
DESCRIPTION = "SILLY means Simple Image Loading LibrarY. The aim of this library is to provide \
a simple library for loading image in the context of CEGUI. The library supports \
only the most common image format. The project was initially launch in order \
to provide an MIT based replacement of DevIL with less image format supported \
and focused on loading image only."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libSILLY1-0.1.0-2.11.aarch64.rpm"
RPM_HASH = "8f94e5e2049df03d707aba5a9d3c4f59df6271845f374476dc7003943ce284ecfa81a8458f773bea4d8a4bdb36400897d9d27fb2750df23a352c82d19dd8ddf1"

RPROVIDES:${PN} += "libSILLY.so.1 \
libSILLY1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
