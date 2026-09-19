SUMMARY = "The GraphicsMagick image conversion runtime library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package is compiled with Q16, that means it provides better \
performance on 16 and less bit images."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "libGraphicsMagick-Q16-3-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "e55ac675d0e8c5d44ae3a38ddaa93adbb6d8c11614a9bd37b207c98bc81a2bb8ebf554b9a993d4589d190a92cefcb63c0d7173ac1f3c3a79ba054177f28a4138"

RPROVIDES:${PN} += "libGraphicsMagick-Q16-3 \
libGraphicsMagick-Q16.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick3-config \
libX11.so.6 \
libXext.so.6 \
libbz2.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgomp.so.1 \
libjbig.so.2 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libwmflite-0.2.so.7 \
libxml2.so.16 \
libz.so.1"

inherit rpm
