SUMMARY = "Qt 6 Graphs library - Development files"
DESCRIPTION = "Development files for the Qt 6 Graphs library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d2089e5bdca73f5243ea93ea0c45a294c99699f1c143f21ce31f859fcf340d088c3f647149cb2b5094a6d4faa7fa32c4f84c7992e591a1723e5e169991d1a33c"

RPROVIDES:${PN} += "cmake-Qt6Graphs \
cmake-Qt6GraphsWidgets \
pkgconfig-Qt6Graphs \
pkgconfig-Qt6GraphsWidgets \
qt6-graphs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6QuickWidgets \
libQt6Graphs6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Graphs \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6QuickWidgets"

inherit rpm
