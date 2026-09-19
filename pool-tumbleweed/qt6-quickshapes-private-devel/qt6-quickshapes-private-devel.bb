SUMMARY = "Qt 6 QuickShapes library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickshapes-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "103cc3fede7e045cf912563ef1866921abeba26fc65cf009cca3e5a31cc4e4a96a9f7f7b10360d53514025b804788ff05aaa6bad186e49bced39217932cf47ba"

RPROVIDES:${PN} += "cmake-Qt6QuickShapes \
cmake-Qt6QuickShapesDesignHelpersPrivate \
cmake-Qt6QuickShapesPrivate \
pkgconfig-Qt6QuickShapes \
qt6-quickshapes-devel \
qt6-quickshapes-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6GuiPrivate \
cmake-Qt6Qml \
cmake-Qt6QuickPrivate \
libQt6QuickShapes6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
