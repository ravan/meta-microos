SUMMARY = "Qt 6 WebSockets library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebSockets library"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f9ad3470c80274d630a68fa4898fff4c1fea1708d061c4341a398bada0d89a8b90b4be581deae2da6af2b398856a8307610278b2f9c4fc828f4fa39340a27f86"

RPROVIDES:${PN} += "cmake-Qt6WebSockets \
pkgconfig-Qt6WebSockets \
qt6-websockets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6WebSockets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
