SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlcompiler-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "bb3b3e17d3d7da10812ef9ad9a338a0df8e248451153a40be4effc792cbf53e76afa746a503ee6472f5f59bd7f796747690947e10138eebae0876890edcd0b02"

RPROVIDES:${PN} += "cmake-Qt6QmlCompiler \
pkgconfig-Qt6QmlCompiler \
qt6-qmlcompiler-devel \
qt6-qmlcompiler-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate \
libQt6QmlCompiler6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
