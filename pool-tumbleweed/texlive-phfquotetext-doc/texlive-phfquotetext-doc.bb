SUMMARY = "Documentation for texlive-phfquotetext"
DESCRIPTION = "This package includes the documentation for texlive-phfquotetext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-doc-2026.226.1.0svn41869-58.2.noarch.rpm"
RPM_HASH = "23c1a7bbbb0b87fcebccb6c23aa46a48cd415787fc7761dd7cc40aef97251a48b3beeb6156d92de69e42b612cb39dc4f14fdc27a63c12f5b19bb3a8bd75de568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfquotetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
