SUMMARY = "Development files for dav1d"
DESCRIPTION = "The dav1d-devel package contains libraries and header files for \
developing applications that use dav1d."
LICENSE = "BSD-2-Clause"

PV = "1.5.4"

RPM_NAME = "dav1d-devel-1.5.4-1.2.aarch64.rpm"
RPM_HASH = "2d81f48eb885b25d85bd6da76476e55b0c9d10b80e08dc27efc003e6dc86ae255a4e4749a65efb5d0c2411508877c94ecc93ae35406c63bfe1000f60199e5398"

RPROVIDES:${PN} += "dav1d-devel \
pkgconfig-dav1d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdav1d7"

inherit rpm
