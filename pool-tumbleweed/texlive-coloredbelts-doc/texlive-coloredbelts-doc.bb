SUMMARY = "Documentation for texlive-coloredbelts"
DESCRIPTION = "This package includes the documentation for texlive-coloredbelts"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78037"

RPM_NAME = "texlive-coloredbelts-doc-2026.226.0.0.20asvn78037-60.2.noarch.rpm"
RPM_HASH = "bf296a9a68866532c9cb59a7c21c672813979667e098a4cd995bbffb02e2e27eb5c7b432020d7a4497ecb5fa31f533ca5fa36156732d5036bb409fd827eb8c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-coloredbelts-doc-en;fr \
texlive-coloredbelts-doc"

RDEPENDS:${PN} += ""

inherit rpm
