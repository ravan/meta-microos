SUMMARY = "Viewer and Converter for Images"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation \
utility. It is capable of displaying still images and animations \
using the X Window system which provides an interface for \
interactively editing images, and is capable of importing selected \
windows or the entire desktop. It can read and write over 88 image \
formats, including JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. \
It also allows to resize, rotate, sharpen, color reduce, or add \
special effects to an image and to save the result to any supported \
format. GraphicsMagick may be used to create animated or transparent \
.gifs, to composite images, and to create thumbnail images. \
 \
This package is compiled with Q16, which means that it provides better \
performance on 16 bit images and less."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "GraphicsMagick-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "218481848261b6b1f5d252ade88fb1da2b0074d38be26b76c563803811b6577acefd3c5212d2e00a60e27767b92be671e5d0b1c873b3d240b60e344ad3f07f02"

RPROVIDES:${PN} += "GraphicsMagick"

RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3 \
libc.so.6"

inherit rpm
