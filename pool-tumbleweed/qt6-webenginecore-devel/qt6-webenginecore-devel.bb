SUMMARY = "Development files for the Qt 6 WebEngineCore library"
DESCRIPTION = "Development files for the Qt 6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginecore-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "22ed65bfc66d99f940733f030685e95576244f9d90d86f5c6d2c644d95de3924bfa1b6d5621f04b1788a9c9ce314b60273a849012ddfd7726780900c8b892749"

RPROVIDES:${PN} += "cmake-Qt6WebEngineCore \
cmake-Qt6WebEngineCoreTools \
pkgconfig-Qt6WebEngineCore \
qt6-webenginecore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Positioning \
cmake-Qt6Quick \
cmake-Qt6WebChannel \
libQt6WebEngineCore6 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6Quick \
pkgconfig-Qt6WebChannel"

inherit rpm
