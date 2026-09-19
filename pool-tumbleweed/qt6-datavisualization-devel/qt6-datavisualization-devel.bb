SUMMARY = "Qt 6 DataVisualization library - Development files"
DESCRIPTION = "Development files for the Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavisualization-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "18bc0ad312abf59d05ec5c8f7c85a0ff1931731177308ade1705cc2cbfc4aeb030eae45a64ac692ef21c826c68b4761753994e5acb7e4a4f4cb816762a3e83e3"

RPROVIDES:${PN} += "cmake-Qt6DataVisualization \
pkgconfig-Qt6DataVisualization \
qt6-datavisualization-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
libQt6DataVisualization6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL"

inherit rpm
