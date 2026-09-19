SUMMARY = "Qt 6 SerialBus library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialBus library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9d11a75b9cbfc53557aa4d12b31a1277990af76c87845e62d9c454f7392c4d59a2901ec11c26b09fec30fb3233fc7529e1700c35f73f7787cf0c17731920f71a"

RPROVIDES:${PN} += "cmake-Qt6SerialBus \
pkgconfig-Qt6SerialBus \
qt6-serialbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6SerialPort \
libQt6SerialBus6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6SerialPort \
qt6-serialbus"

inherit rpm
