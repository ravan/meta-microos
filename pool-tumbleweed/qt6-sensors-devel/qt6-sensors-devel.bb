SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "50a89885409fb32ef5c1ee9eeda197e31da6a10d48cb99ee5497078a05707e1844f6cdd16f42334b870d7c338d79567bd170a774d7396cf769ddee801a592a32"

RPROVIDES:${PN} += "cmake-Qt6Sensors \
pkgconfig-Qt6Sensors \
qt6-sensors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sensors6 \
pkgconfig-Qt6Core"

inherit rpm
