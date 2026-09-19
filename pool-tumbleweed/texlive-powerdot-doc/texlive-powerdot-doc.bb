SUMMARY = "Documentation for texlive-powerdot"
DESCRIPTION = "This package includes the documentation for texlive-powerdot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-powerdot-doc-2026.226.1.7svn77682-59.2.noarch.rpm"
RPM_HASH = "d2b48fee7918d5a0ec7da69383c5bd63c0a7e846be4c1d60eb39cc9b4f64226a45844825e51d95b8306e79bc189bfbe1ddfd9f004ac407cbc77e6684d31f66c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-powerdot-doc-en;de \
texlive-powerdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
