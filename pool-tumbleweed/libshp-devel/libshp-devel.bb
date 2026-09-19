SUMMARY = "Development Environment for shapelib"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the development environment for shapelib project."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.6.3"

RPM_NAME = "libshp-devel-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "1b42c9cabac183664d800683bc1bf8f45e46a0dc4dffa81a9a72dc6f0ad230273f563cc7c98b86a450a22a8b5178a86965c9db50eba8615cbffa29c16acc1ff5"

RPROVIDES:${PN} += "libshp-devel \
pkgconfig-shapelib \
shapelib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshp4"

inherit rpm
