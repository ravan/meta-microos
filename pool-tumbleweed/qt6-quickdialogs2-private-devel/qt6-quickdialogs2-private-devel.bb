SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "bb8663580d9bc2b544ac1857bf2961d3647d5994e51373d53f1db2eee1983af3f0b5d1ef54e790aaa514d21c6313be09aad818ee95977175e419364a0e25c8c9"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Private \
qt6-quickdialogs2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlModelsPrivate \
cmake-Qt6QuickDialogs2"

inherit rpm
