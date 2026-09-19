SUMMARY = "Development files for the Qt 5 3D QuickExtras library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickExtras-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "bd57fb581ce4bee107722556215d7c9c652e1927011c26278a0a52edf74d029e17866491141a5379c516314ea5b427b40232e9e3005036b4f2a7cd393107f6d6"

RPROVIDES:${PN} += "cmake-Qt53DQuickExtras \
libQt53DQuickExtras-devel \
pkgconfig-Qt53DQuickExtras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickExtras5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DExtras \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DLogic \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
