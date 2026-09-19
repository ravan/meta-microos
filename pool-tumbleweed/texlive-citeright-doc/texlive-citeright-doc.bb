SUMMARY = "Documentation for texlive-citeright"
DESCRIPTION = "This package includes the documentation for texlive-citeright"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn75480"

RPM_NAME = "texlive-citeright-doc-2026.226.1.0.0svn75480-60.2.noarch.rpm"
RPM_HASH = "32f10390e29e7dece53c3ebceb7a1d44b5dacc2fa55cb9ef323f3fa2845d38a8e6b646cb581706f92abcd745230cc86760ab3fe95553a779e90b0577b79ed095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeright-doc"

RDEPENDS:${PN} += ""

inherit rpm
