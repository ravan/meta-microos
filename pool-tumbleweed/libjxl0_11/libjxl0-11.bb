SUMMARY = "Library for encoding and decoding JPEG XL raster graphic images"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression."
LICENSE = "BSD-3-Clause"

PV = "0.11.2"

RPM_NAME = "libjxl0_11-0.11.2-2.3.aarch64.rpm"
RPM_HASH = "28ce448c4d17d88356617162291be39a38eef7479f33fd7db662b265f46a8593364a4ffecd33f8fab1d3d376e5734fb77a0983269c96c9027f6c14434083abf0"

RPROVIDES:${PN} += "libjxl-cms.so.0.11 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libjxl0-11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libhwy.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
