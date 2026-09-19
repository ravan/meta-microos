SUMMARY = "OpenGL-based FITS image viewer"
DESCRIPTION = "FIPS is a cross-platform FITS viewer with responsive user interface. Unlike \
other FITS viewers FIPS uses GPU hardware via OpenGL to provide usual \
functionality such as zooming, panning and level adjustments. OpenGL 2.1 and \
later is supported. \
 \
FIPS supports all 2D image formats except of 64-bit floating point numbers \
(BITPIX=-64). FITS image extension has basic limited support."
LICENSE = "LGPL-3.0-only"

PV = "3.5.0"

RPM_NAME = "fips-3.5.0-1.3.aarch64.rpm"
RPM_HASH = "4fded7db52d107da4ac995f7fd84f12f8dd69fa43ff3f91ae7bbcbbb85770f6ab5b6911f8c31d600e38a8188e2c4f1199960367cb1d1315f96319c6d2e99a1a1"

RPROVIDES:${PN} += "fips"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
