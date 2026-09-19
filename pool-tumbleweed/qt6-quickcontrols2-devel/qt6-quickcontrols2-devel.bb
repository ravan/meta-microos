SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickcontrols2-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "eadaa5fc85696291dc51f66d88329dfffa41ee33a6dd7c24fbe3ec770991bdb88cf9d27315db0d290d4b123c71afe85c3bf581d3d29fb6e6b55afac31141df13"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2 \
pkgconfig-Qt6QuickControls2 \
qt6-quickcontrols2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
