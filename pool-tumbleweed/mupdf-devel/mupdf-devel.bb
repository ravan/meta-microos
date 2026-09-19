SUMMARY = "Development Files for mupdf"
DESCRIPTION = "This package contains development files needed for developing applications \
based on mupdf."
LICENSE = "AGPL-3.0-or-later"

PV = "1.28.3"

RPM_NAME = "mupdf-devel-1.28.3-1.1.aarch64.rpm"
RPM_HASH = "7d6ab10e0921075642ddd2884d26e555c1421171edd818393fdbdb1c941dc57ec4f5fdaa37b3fe37b7548e8ec9d4fed67bd5dbc9867ecb77ace19d2f9f9445af"

RPROVIDES:${PN} += "mupdf-devel \
pkgconfig-mupdf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmupdf28-3"

inherit rpm
