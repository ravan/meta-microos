SUMMARY = "C++ interface runtime library for ImageMagick"
DESCRIPTION = "This is Magick++, the object-oriented C++ API for the ImageMagick \
image-processing library. \
 \
Magick++ supports an object model inspired by PerlMagick. Magick++ \
should be faster than PerlMagick since it is written in a compiled \
language which is not parsed at run-time. This makes it suitable for \
Web CGI programs. Images support implicit reference counting so that \
copy constructors and assignment incur almost no cost. The cost of \
actually copying an image (if necessary) is done just before \
modification and this copy is managed automatically by Magick++. \
De-referenced copies are automatically deleted. The image objects \
support value (rather than pointer) semantics so it is trivial to \
support multiple generations of an image in memory at one time."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "libMagick++-7_Q16HDRI5-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "f16c2d0d3ff39beb70a45c7377f61634aa3fc61ddf2dfbc380b9c22c1f878e31bf5be5062ed4d4d95db9b7190d7f31c97d20758e7de0004d520b4d4fe1ae30f7"

RPROVIDES:${PN} += "libMagick++-7-Q16HDRI5 \
libMagick++-7.Q16HDRI.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
