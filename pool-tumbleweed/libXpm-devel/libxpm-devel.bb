SUMMARY = "Development files for the X Pixmap image file format library"
DESCRIPTION = "libXpm facilitates working with XPM (X PixMap), a format for \
storing/retrieving X pixmaps to/from files. \
 \
This package contains the development headers for the library found \
in libXpm4."
LICENSE = "MIT"

PV = "3.5.18"

RPM_NAME = "libXpm-devel-3.5.18-2.3.aarch64.rpm"
RPM_HASH = "1f626d62f903a20082f27a321c363cb4ad2e3f27f27f5ada759143d4fb2b27da1254b2473ee72c4b224a7af7566b83150cd72ff8f253ad5427f60eb41738b902"

RPROVIDES:${PN} += "libXpm-devel \
pkgconfig-xpm \
xorg-x11-libXpm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXpm4 \
pkgconfig-x11"

inherit rpm
