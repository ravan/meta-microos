SUMMARY = "Development files for taglib"
DESCRIPTION = "This package contains development files for taglib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3"

RPM_NAME = "libtag-devel-2.3-1.2.aarch64.rpm"
RPM_HASH = "d89c2bf95d2d175fa0c03ae05e8556a4852f2e3b48f7d364ce74f57fb21b07913cbfce7644d4990104ba86d175ca49fc71765003c33e734918475a62376a1e80"

RPROVIDES:${PN} += "cmake-taglib \
libtag-devel \
pkgconfig-taglib \
pkgconfig-taglib-c \
taglib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libstdc++-devel \
libtag-c2 \
libtag2 \
pkgconfig-taglib \
zlib-devel"

inherit rpm
