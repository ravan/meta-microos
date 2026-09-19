SUMMARY = "Development files for argtable, a command line parsing library"
DESCRIPTION = "The libargtable2-devel package contains libraries and header files for \
developing applications that use libargtable."
LICENSE = "LGPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "libargtable2-devel-2.13-4.7.aarch64.rpm"
RPM_HASH = "000c7e9f208f3afb57c97db21e265509ec9c25b6c212951df9a7972ccfeed635a357511414655d17187e466e4f103b149821d72605426f98b3e27cde9b020f55"

RPROVIDES:${PN} += "libargtable2-devel \
pkgconfig-argtable2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargtable2-0"

inherit rpm
