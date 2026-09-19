SUMMARY = "Documentation for texlive-fltpoint"
DESCRIPTION = "This package includes the documentation for texlive-fltpoint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-doc-2026.226.1.1bsvn56594-60.2.noarch.rpm"
RPM_HASH = "6dd0abaf6476e7b930b90c06caf6bf5ac6d19ad177dec2c5b4e721c57e2c516973ee39cf9afa2815da0830aaaa3c281e3a9ceec1fc6962132faec22cb036830b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fltpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
