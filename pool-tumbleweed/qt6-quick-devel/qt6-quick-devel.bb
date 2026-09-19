SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "cc1eff29773748acde6528b5a979736addc63d32fa51a410505c5e074cfdcce3b4dd0a0558ca4f182002e6e035da03c6b7ec0a139f6f8db84d4e6b716b6ebd77"

RPROVIDES:${PN} += "cmake-Qt6Quick \
cmake-Qt6QuickTools \
pkgconfig-Qt6Quick \
qt6-quick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6QmlMeta \
cmake-Qt6QmlModels \
libQt6Quick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml"

inherit rpm
