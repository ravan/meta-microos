SUMMARY = "Qt 6 CanvasPainter library - Development files"
DESCRIPTION = "Development files for the Qt 6 CanvasPainter library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-canvaspainter-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ab577253760dc0931769499c24cde5a86c4c3c28ae6b9ada1670d34047cd6034e387f23097fcc4d4b0dd4c68b7b26e9c74d8abba89b48c8097c522b0e6eff645"

RPROVIDES:${PN} += "cmake-Qt6CanvasPainter \
cmake-Qt6CanvasPainterTools \
pkgconfig-Qt6CanvasPainter \
qt6-canvaspainter-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libQt6CanvasPainter6 \
libQt6Core.so.6 \
libc.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Widgets"

inherit rpm
