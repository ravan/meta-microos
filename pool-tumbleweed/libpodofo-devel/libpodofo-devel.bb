SUMMARY = "Development files for podofo"
DESCRIPTION = "This package contains development files for podofo library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libpodofo-devel-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "2d19c2a13a4bad598c90b887caf506b217bb7f7d899164c3b4f7ea0ba620344b52c417cc010ecd1bf7cce7ca9371504c7609565f6e845f8cf787e8696919c9b8"

RPROVIDES:${PN} += "cmake-podofo \
libpodofo-devel \
pkgconfig-libpodofo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpodofo4 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libssl \
pkgconfig-libtiff-4 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
