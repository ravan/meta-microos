SUMMARY = "Documentation for texlive-multiobjective"
DESCRIPTION = "This package includes the documentation for texlive-multiobjective"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-multiobjective-doc-2026.226.1.0svn75878-61.2.noarch.rpm"
RPM_HASH = "5910e66407385415a32a2d33e4738b960d9c34d1210f12c93f2404854c6675cad74032a22bd2759be0ef05a0b4173055f88101af8a3b337b21c4983e3cf4dbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiobjective-doc"

RDEPENDS:${PN} += ""

inherit rpm
