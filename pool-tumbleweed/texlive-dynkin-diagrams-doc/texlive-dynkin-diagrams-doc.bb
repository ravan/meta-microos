SUMMARY = "Documentation for texlive-dynkin-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-dynkin-diagrams"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.141592653589793238462svn76924"

RPM_NAME = "texlive-dynkin-diagrams-doc-2026.226.3.141592653589793238462svn76924-61.4.noarch.rpm"
RPM_HASH = "86e6eb9a5de847271d442950ea23c218c8e8655f858ee71cbb9191617dbfa15cd398f47e673362573dde101d59b651ac3dab0876c14490159f471ffdba26262d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynkin-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
