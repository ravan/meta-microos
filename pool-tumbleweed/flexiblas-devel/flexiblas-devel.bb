SUMMARY = "Development files for flexiblas"
DESCRIPTION = "This package contains development files for flexiblas."
LICENSE = "LGPL-3.0 & BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "flexiblas-devel-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "4810828dc0276e34f925974e844ac2b726f533f85c088896cee1421e44f6148dc534a58358df054b77b4a284cdc88580856dd49a5ed57696f1406e38ba2983e0"

RPROVIDES:${PN} += "flexiblas-devel \
pkgconfig-flexiblas \
pkgconfig-flexiblas-api"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
flexiblas \
pkgconfig"

inherit rpm
