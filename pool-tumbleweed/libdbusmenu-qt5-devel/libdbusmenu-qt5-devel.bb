SUMMARY = "Development package for libdbusmenu-qt5"
DESCRIPTION = "This package contains development files for libdbusmenu-qt5."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-devel-0.9.3+16.04.20160218-3.7.aarch64.rpm"
RPM_HASH = "3eebbfcf23defe748075fd5b3d2ffe718c274ba0f79806fffcb0a06697fc8c5168f06fce44defd90bd25a197d5179882e6b5532ba22bad82cf4ed149c0eafb39"

RPROVIDES:${PN} += "cmake-dbusmenu-qt5 \
libdbusmenu-qt5-devel \
pkgconfig-dbusmenu-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-qt5-2 \
pkgconfig-Qt5Core"

inherit rpm
