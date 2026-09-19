SUMMARY = "Documentation for texlive-bib-fr"
DESCRIPTION = "This package includes the documentation for texlive-bib-fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76790"

RPM_NAME = "texlive-bib-fr-doc-2026.226.1.5svn76790-61.2.noarch.rpm"
RPM_HASH = "ba72d819109a6ff11d1ebdd36de25ce93c1d990f7080222bceb0b7a2f17c1d2cdf97ffcc76a5a37d33c1274cf45b5c27dfed836f01094fddd1d6f37f810e0fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
