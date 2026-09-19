SUMMARY = "Development files for the GraphicsMagick C++ language API"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "libGraphicsMagick++-devel-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "15ed1ea0db883e5891d79b6e94579b4abd625e235f044456eaea7ed781d5dd7edb8b77fdb6402ca965ed2714b30616b85068e650f15f856401971705364fa522"

RPROVIDES:${PN} += "GraphicsMagick-C++-devel \
libGraphicsMagick++-devel \
pkgconfig-GraphicsMagick++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
GraphicsMagick-devel \
c++-compiler \
libGraphicsMagick++-Q16-12 \
pkgconfig-GraphicsMagick"

inherit rpm
