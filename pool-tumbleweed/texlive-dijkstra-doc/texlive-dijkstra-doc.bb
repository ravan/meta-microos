SUMMARY = "Documentation for texlive-dijkstra"
DESCRIPTION = "This package includes the documentation for texlive-dijkstra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-doc-2026.226.0.0.13svn64580-59.2.noarch.rpm"
RPM_HASH = "cc1b1598fa8b1225b643e0329574d75c0ae0e35989627b346122e1d8110d7ae3e4a3eefc6ed3ee6957184f626d71f98c96c849179924ddb984dea38e10d556da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dijkstra-doc-fr \
texlive-dijkstra-doc"

RDEPENDS:${PN} += ""

inherit rpm
