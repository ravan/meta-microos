SUMMARY = "Development files for libmapidb, a library for accessing the Exchange MAPI database format"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmapidb."
LICENSE = "LGPL-3.0-or-later"

PV = "20240420"

RPM_NAME = "libmapidb-devel-20240420-1.13.aarch64.rpm"
RPM_HASH = "e0e114e4b122013dea470b4224cc7b75b660074283e7ea827448cd0d2201d23475029bb8ed61e7722ac387b5cd7d2389319d504f7ea27ba2cd91ac1d1d74f0e5"

RPROVIDES:${PN} += "libmapidb-devel \
pkgconfig-libmapidb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmapidb1"

inherit rpm
