SUMMARY = "Documentation for texlive-synproof"
DESCRIPTION = "This package includes the documentation for texlive-synproof"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-synproof-doc-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "81d0cc7b2916307ed9285909ea5bb8c0b56ff6bf022623f906312be7325af8e385a5abc816053855e7d9b3993c00c0d0f8163bb4ac4e9fa1eb645b10a8303aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
