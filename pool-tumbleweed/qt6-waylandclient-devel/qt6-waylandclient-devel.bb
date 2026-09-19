SUMMARY = "Development files for the Qt 6 WaylandClient library"
DESCRIPTION = "Development files for the Qt6 WaylandClient library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-waylandclient-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "b3577c0d1426163ca7da2bce61e02a09557bf9097d5e1c8b74fce40c9cfb06c3d4f28a3a31593e4b9b8d321ac9432306a015d925a18d7ca6bb54a78a9b624420"

RPROVIDES:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandScannerTools \
pkgconfig-Qt6WaylandClient \
qt6-waylandclient-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6WaylandGlobalPrivate \
libQt6WaylandClient6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-wayland"

inherit rpm
