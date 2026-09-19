SUMMARY = "Documentation for texlive-minted"
DESCRIPTION = "This package includes the documentation for texlive-minted"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.7.0svn77682"

RPM_NAME = "texlive-minted-doc-2026.226.3.7.0svn77682-61.2.noarch.rpm"
RPM_HASH = "be8c5968d34b26af187c6fda6dee1d125f76b0694ec8c466c97eb41bf64600584c2f4301a73b56b8d35c076490f46a20d7339d2e770edf458417225656bf1ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexminted.1 \
texlive-minted-doc"

RDEPENDS:${PN} += ""

inherit rpm
