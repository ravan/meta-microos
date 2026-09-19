SUMMARY = "Qt 6 SerialPort library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialPort library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialport-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "94de72e484378c8b0dc489b5bab62fd6bec2ec10d287261fb0c6591ffa522e6ac20bb683a43c8bcfc05a2855be4f513649365596bc62f211dd6ea62b596f1e9a"

RPROVIDES:${PN} += "cmake-Qt6SerialPort \
pkgconfig-Qt6SerialPort \
qt6-serialport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6SerialPort6 \
pkgconfig-Qt6Core"

inherit rpm
