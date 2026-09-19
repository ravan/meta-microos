SUMMARY = "Devel files for libqtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "libqt5xdg-devel-3.12.0-3.12.aarch64.rpm"
RPM_HASH = "5a88c3b33a0bf39dc5cad8a46463df3ca20296cb9ac0673819d8038c67c4bd392b72b0b700be5561ba25220ff7901e2738bf8296844e53ecefc0d0bf7e7d8f3a"

RPROVIDES:${PN} += "cmake-qt5xdg \
libqt5xdg-devel \
pkgconfig-Qt5Xdg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Xdg3 \
pkgconfig \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus \
pkgconfig-Qt5UiTools \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5XdgIconLoader \
pkgconfig-Qt5Xml"

inherit rpm
