SUMMARY = "Documentation for texlive-gmdoc-enhance"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc-enhance"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-doc-2026.226.0.0.2svn15878-60.4.noarch.rpm"
RPM_HASH = "978ec4a27c76f6b95129a71ee139d3df36dc42cd2b1ce7204fae4c72775799d2f26ef5ffead4c155a41f56b5e3f4ac818c615485f53f7894769fcee5aae2541c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-enhance-doc"

RDEPENDS:${PN} += ""

inherit rpm
