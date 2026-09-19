SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "862d3fa390d069a9f5539c146984fca7c572f6f7b6944f3be73eb730dee7f89e9f69d8cd02bc15b9dc5c224643e669b549735e480baa84a4052968a992d3f710"

RPROVIDES:${PN} += "libmgl.so.8 \
libmgl8 \
mathgl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
libhpdf.so.2.4 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
mathgl-fonts"

inherit rpm
