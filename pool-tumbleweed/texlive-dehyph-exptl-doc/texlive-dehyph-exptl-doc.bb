SUMMARY = "Documentation for texlive-dehyph-exptl"
DESCRIPTION = "This package includes the documentation for texlive-dehyph-exptl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72949"

RPM_NAME = "texlive-dehyph-exptl-doc-2026.226.1.0svn72949-59.2.noarch.rpm"
RPM_HASH = "5ff2cf7d18587f007e2a881bb0c5a40e7933df70b9c401b45515dad86424bb8de9ade5622733b347a3b3175227277a8cef43e262aae08c6c0f3a1a34e3f7b2e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dehyph-exptl-doc-de \
texlive-dehyph-exptl-doc"

RDEPENDS:${PN} += ""

inherit rpm
