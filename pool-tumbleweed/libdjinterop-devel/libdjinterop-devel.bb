SUMMARY = "Headers for libdjinterop, a DJ record database library"
DESCRIPTION = "libdjinterop is a C++ library for accessing database formats used to \
store information about DJ record libraries."
LICENSE = "LGPL-3.0-only"

PV = "0.27.1"

RPM_NAME = "libdjinterop-devel-0.27.1-1.1.aarch64.rpm"
RPM_HASH = "6978f52b6868cc888ac9c114ccd4b7cd4b0327233e49a1a151db3381cdf5c40be245698420f0c68c218a7524e3f3bb4ff70eeb61261664c30b393da9d83f3d9d"

RPROVIDES:${PN} += "cmake-DjInterop \
libdjinterop-devel \
pkgconfig-djinterop"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdjinterop0 \
pkgconfig-sqlite3 \
pkgconfig-zlib"

inherit rpm
