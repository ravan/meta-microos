SUMMARY = "Generic map viewer: data"
DESCRIPTION = "Marble is a viewer of map data. This package contains its data."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-data-26.08.1-1.2.noarch.rpm"
RPM_HASH = "abb0678800890fd8f7b45d0dfff6733092cf19e47ab0ab428edf1ca3561ff2bdf1d104efe418132a7445d675e53666769c3c05a62ae0a036dae3fe8d339033de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-data \
marble5-data"

RDEPENDS:${PN} += "marble"

inherit rpm
