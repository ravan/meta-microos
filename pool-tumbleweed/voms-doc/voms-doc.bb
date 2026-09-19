SUMMARY = "Virtual Organization Membership Service Documentation"
DESCRIPTION = "Documentation for the Virtual Organization Membership Service APIs."
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "voms-doc-2.1.3-1.3.noarch.rpm"
RPM_HASH = "0f7af3ea470863a407f21458e62d5cdc23fcb87f929ee487fdc9fc1fb868ea7cbff3ff3a1c57bb71b05c4266a1d1162de597f7a3f870749e5c928e7f196509ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "voms-doc"

RDEPENDS:${PN} += ""

inherit rpm
