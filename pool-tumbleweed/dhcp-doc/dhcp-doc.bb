SUMMARY = "Documentation"
DESCRIPTION = "This package contains additional documentation files provided with \
the software. The manual pages are in the corresponding packages."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-doc-4.4.3.P1-1.2.noarch.rpm"
RPM_HASH = "9cd5094ee655ff6f8b05a1120681b070e436340e8270c180f384da71b0915a32d9289c9767b0b5c554b8e43770e0c2f33cf7a45d67693169a7e4856de459184d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dhcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
