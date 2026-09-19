SUMMARY = "Qt 6 ChartsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-chartsqml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e47751730cfc87d361038fb6197d78a0ccd0ba63ff3adf9fe0e7d925acf861334670bab5cb5288c0a6d90f9a3edcf2d344e91453d3c2a26e420bb9207600dadd"

RPROVIDES:${PN} += "cmake-Qt6ChartsQml \
pkgconfig-Qt6ChartsQml \
qt6-chartsqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Charts \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6ChartsQml6 \
pkgconfig-Qt6Charts \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
