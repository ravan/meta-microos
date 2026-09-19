SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "libvips42-8.18.5-1.3.aarch64.rpm"
RPM_HASH = "5cccfe21400df646947ae1616939225cff9c93e33dd2442cf20056173e25adcc333b4b10473c227b48a9653934063f55a7097eb781e23b0e6b7a8367f654c61c"

RPROVIDES:${PN} += "libvips-cpp.so.42 \
libvips.so.42 \
libvips42"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libexif.so.12 \
libexpat.so.1 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libhwy.so.1 \
libimagequant.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libmatio.so.14 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libraw-r.so.25 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libz.so.1 \
vips-modules-8.0"

inherit rpm
