SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "11c96f0e3c0cbd3c8f1117e854e62d969d13698dbb201ab5da94ff53d90e00a33f87f8c19f4fac0f1662483cf195e7faf6b511bb8c8510c4aaabaddb27e86358"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2QuickImpl \
pkgconfig-Qt6QuickDialogs2QuickImpl \
qt6-quickdialogs2quickimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2Utils \
cmake-Qt6QuickTemplates2 \
libQt6QuickDialogs2QuickImpl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
