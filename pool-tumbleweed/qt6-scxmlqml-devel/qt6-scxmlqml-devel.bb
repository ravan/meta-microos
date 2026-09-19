SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxmlqml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b50598187dcf6e275789be08b8a7be62745fea35699b3180d1ef7dc88b7ff5f5c3f0cb35afe144ea8069c6d3ebdcd16f3e7deccdc0fa44bcd75a0fc25bc86473"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQml \
pkgconfig-Qt6ScxmlQml \
qt6-scxmlqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Scxml \
libQt6ScxmlQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Scxml"

inherit rpm
