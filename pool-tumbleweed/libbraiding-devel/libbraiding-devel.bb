SUMMARY = "Development files for the CBraid library"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libbraiding-devel-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "1b85be0f9038eb0a583c08398ca558f4c9b43cf6bd3f574ab5bd538268351b11460947b421357ad1960b01e6f73446eff16ee27b8813b9f2ee3e4caf1039aa0d"

RPROVIDES:${PN} += "libbraiding-devel \
pkgconfig-libbraiding"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbraiding0"

inherit rpm
