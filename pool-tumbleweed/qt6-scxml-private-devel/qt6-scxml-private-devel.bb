SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "717330781f7d8e17fbc2107c102de58f21e8dfdce2089584884b39d406570ada7ea95059717b3aea43628e5397cdf8a9ab448e0917e5289e4ea2d482711f6af1"

RPROVIDES:${PN} += "cmake-Qt6ScxmlPrivate \
qt6-scxml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Scxml"

inherit rpm
