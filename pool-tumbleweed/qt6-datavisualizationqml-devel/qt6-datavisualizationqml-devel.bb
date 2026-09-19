SUMMARY = "Qt 6 DataVisualizationQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavisualizationqml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "339fefec4f0500d7bd3ddd2fba8fe82e8c8e4f49829947b1784f62e5fd448d4a9f7522b6328a2c823968f2ef19ff460722315bb09b4582368c92e67ebf38843f"

RPROVIDES:${PN} += "cmake-Qt6DataVisualizationQml \
pkgconfig-Qt6DataVisualizationQml \
qt6-datavisualizationqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6DataVisualization \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6DataVisualizationQml6"

inherit rpm
