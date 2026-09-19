SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e25cce0d1aad221922fad0c6a537d38c01a88111a34e93e50ce40c1668f1076356f7e90222094719ffff64ec5356c737a27a32542e2f0ed102e6610fb197e956"

RPROVIDES:${PN} += "cmake-Qt6MultimediaPrivate \
qt6-multimedia-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6Multimedia"

inherit rpm
