SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensorsquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bbdff60775150ba1bd284da545c3a9a5d9a0c2168e6c2c2db6305df2b68e2a74a248a9a885ea7eb94ab2de41c87e09775d9c545521edb3422fa9a209a6bc674c"

RPROVIDES:${PN} += "cmake-Qt6SensorsQuick \
pkgconfig-Qt6SensorsQuick \
qt6-sensorsquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Sensors \
libQt6SensorsQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Sensors"

inherit rpm
