SUMMARY = "Development files for the X Miscellaneous Utility Libraries"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets. \
 \
This package contains the development headers for the library found \
in libXmu6 and libXmuu1."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libXmu-devel-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "d3a1a02b944b74bbeec2e86defebaabd7537059de6e5bee6110df1b4766126fedbbb10cefaef281c38ca3943d4f21f8861c4705a9fd94556fe4b56656a7ad472"

RPROVIDES:${PN} += "libXmu-devel \
pkgconfig-xmu \
pkgconfig-xmuu \
xorg-x11-libXmu-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXmu6 \
libXmuu1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto \
pkgconfig-xt \
xbitmaps-devel"

inherit rpm
