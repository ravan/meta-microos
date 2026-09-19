SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f2ec137726436e0968e6b44e499590a9ddc0140d6b43bf4d96daa034d3fef8147fa1cd859abdb1263d42cb8711931f0130a565ae766b9ff7c76ae973afdd04a8"

RPROVIDES:${PN} += "cmake-Qt6QuickPrivate \
qt6-quick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlModelsPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6Quick"

inherit rpm
