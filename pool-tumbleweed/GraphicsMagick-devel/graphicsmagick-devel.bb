SUMMARY = "Development files for the GraphicsMagick C language API"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "GraphicsMagick-devel-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "e815db4ce8320116cd8fae4312169e8234f35fcf5f1a6ba6678e8c2d0c24a628ac3d0c470eaf58d945fb77885ed9e7cd494544704f5ff430cacbf58e4ea3bce5"

RPROVIDES:${PN} += "GraphicsMagick-devel \
pkgconfig-GraphicsMagick \
pkgconfig-GraphicsMagickWand"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libGraphicsMagick-Q16-3 \
libGraphicsMagickWand-Q16-2 \
pkgconfig-GraphicsMagick"

inherit rpm
