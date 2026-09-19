SUMMARY = "Documentation for texlive-stage"
DESCRIPTION = "This package includes the documentation for texlive-stage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn62929"

RPM_NAME = "texlive-stage-doc-2026.226.1.03svn62929-64.2.noarch.rpm"
RPM_HASH = "e2a56a06eb9f30aba2942325aa95a0e4cf446e4a7bce1eb8b5e5da4ec976531245db2de5491b8d3706830438ecc323c4fa8407842b7eb3ea5faaa748aca637d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stage-doc"

RDEPENDS:${PN} += ""

inherit rpm
