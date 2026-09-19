SUMMARY = "Configuration for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains GraphicsMagick library configuration files."
LICENSE = "MIT"

PV = "1.3.48"

RPM_NAME = "libGraphicsMagick3-config-1.3.48-2.1.aarch64.rpm"
RPM_HASH = "840d88c7237fd425ca2f03eddb2b545777c78f1c5d66eb8bc38188677c5cbb26c704741d5d7efd66d998b5d62c742046fb6228a1cbe267985fe73d6c61fe0775"

RPROVIDES:${PN} += "libGraphicsMagick3-config"

RDEPENDS:${PN} += ""

inherit rpm
