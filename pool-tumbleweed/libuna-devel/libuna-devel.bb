SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libuna-devel-20260602-1.7.aarch64.rpm"
RPM_HASH = "590dc96a6daf132fd070ce91f3a1ed025e3dbc41d3c699f3443e20a34d40c4e18b45912553759ed818efde38a37c629fa25d7d1e98eca454d5d622f11f9a6ee9"

RPROVIDES:${PN} += "libuna-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1"

inherit rpm
