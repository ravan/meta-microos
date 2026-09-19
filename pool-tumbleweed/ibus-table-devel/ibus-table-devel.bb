SUMMARY = "Development package for ibus-table"
DESCRIPTION = "This package contains the files required for the development of ibus-table."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.14"

RPM_NAME = "ibus-table-devel-1.17.14-2.4.aarch64.rpm"
RPM_HASH = "7ee4d9e0d424beec1a303ef34855e711c9a2e8a6ceb595fd032262248bfa4cb806c463a5a5eed3f05d179a2ef78906ff5448c10e9826224a8cccb81303d04001"

RPROVIDES:${PN} += "ibus-table-devel \
pkgconfig-ibus-table"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table"

inherit rpm
