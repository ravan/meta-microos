SUMMARY = "Qt 6 RemoteObjectsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjectsQml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjectsqml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9ff7ac8513dbc8cdf87e420acfdce484fe8057ab43b10935d45f3332065cfdfaba052df7bb46644c0fa639f2102a2587217aa8b1b17f80fae1817d7351609725"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjectsQml \
pkgconfig-Qt6RemoteObjectsQml \
qt6-remoteobjectsqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6RemoteObjects \
libQt6RemoteObjectsQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6RemoteObjects"

inherit rpm
