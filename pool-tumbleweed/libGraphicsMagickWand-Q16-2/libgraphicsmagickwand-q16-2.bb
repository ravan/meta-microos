SUMMARY = "Runtime library for the GraphicsMagick image conversion library"
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

RPM_NAME = "libGraphicsMagickWand-Q16-2-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "530118380329986a1ad79595cc6bf9aa8859891f7b6c371afb0f5f2ad568fbe5e6d264a0c3b7d0b6a9fcd75ef51b4019e00daae007d6f9a45188e63d97c0199a"

RPROVIDES:${PN} += "libGraphicsMagickWand-Q16-2 \
libGraphicsMagickWand-Q16.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
