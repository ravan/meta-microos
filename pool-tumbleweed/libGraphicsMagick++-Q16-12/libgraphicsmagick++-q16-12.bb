SUMMARY = "C++ interface for the GraphisMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This subpackage contains C++ interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "libGraphicsMagick++-Q16-12-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "1ed23ef02751b65648aa9ec1c98d67463bb455ded6ba7bebbbcccf3e633a0f201195c8c5f8b941a963aeea4ea0d3713747c294af1101eaa2aa2dfe858e6c5c0f"

RPROVIDES:${PN} += "libGraphicsMagick++-Q16-12 \
libGraphicsMagick++-Q16.so.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
