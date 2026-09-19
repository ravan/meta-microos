SUMMARY = "Development files for ImageMagick's C++ interface"
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

RPM_NAME = "libMagick++-devel-7.1.2.30-1.1.aarch64.rpm"
RPM_HASH = "d05b914d0eb0914cf5f68d295ff552f916be1e07789ad16036d8766f110f772fb37d106b4845ede34f533f100d3ea5154c8a9a44d9b089fdea37f0c9c7b83c83"

RPROVIDES:${PN} += "libMagick++-devel \
pkgconfig-Magick++ \
pkgconfig-Magick++-7.Q16HDRI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libMagick++-7-Q16HDRI5 \
libstdc++-devel \
pkgconfig-ImageMagick \
pkgconfig-MagickWand-7.Q16HDRI"

inherit rpm
