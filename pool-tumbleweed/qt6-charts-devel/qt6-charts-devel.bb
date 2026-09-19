SUMMARY = "Qt 6 Charts library - Development files"
DESCRIPTION = "Development files for the Qt 6 Charts library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-charts-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4ab371409fca6c030bdd31ee943fbc112a5698d485d857f59cee9c567fb5352718348a9e526f2dee5468798a3eec5c08db3483f4e374a3ab16419c993cc94c4c"

RPROVIDES:${PN} += "cmake-Qt6Charts \
pkgconfig-Qt6Charts \
qt6-charts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Widgets \
libQt6Charts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6OpenGLWidgets \
pkgconfig-Qt6Widgets"

inherit rpm
