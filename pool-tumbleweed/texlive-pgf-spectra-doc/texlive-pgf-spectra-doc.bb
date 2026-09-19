SUMMARY = "Documentation for texlive-pgf-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pgf-spectra"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.2svn75535"

RPM_NAME = "texlive-pgf-spectra-doc-2026.226.3.0.2svn75535-58.2.noarch.rpm"
RPM_HASH = "c59dd55e7afba0927179e0e11095c227752d53848d5e667afae735b0fa148fa52ebdf5d1cb2f5664ae81f1fc96dd37e7a0d7aea69d079986e7a947900955981f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
