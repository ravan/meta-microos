SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickwidgets-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "373c4fe1e6ced708294b2669f555e56011fce5036c45c679efdb01e83d93898f050fe1f7095089eebb09f194a569312e0eea93f3da67a241f74bf93d1478c553"

RPROVIDES:${PN} += "cmake-Qt6QuickWidgetsPrivate \
qt6-quickwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
cmake-Qt6QuickWidgets \
cmake-Qt6WidgetsPrivate"

inherit rpm
