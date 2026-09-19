SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickdialogs2-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "4ceb9cf9e6830cc29ac31c8c1531ca88494d6d368350d6ed899aacbe5d9558201002e675bd414846fafd7299f4c112e9bf8091ac6463c335bfd4e4d0bbf302bf"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2 \
pkgconfig-Qt6QuickDialogs2 \
qt6-quickdialogs2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickDialogs2Utils \
libQt6QuickDialogs2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
