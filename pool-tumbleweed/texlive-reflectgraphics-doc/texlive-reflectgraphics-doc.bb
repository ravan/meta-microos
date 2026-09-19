SUMMARY = "Documentation for texlive-reflectgraphics"
DESCRIPTION = "This package includes the documentation for texlive-reflectgraphics"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-doc-2026.226.0.0.2csvn40612-60.4.noarch.rpm"
RPM_HASH = "226923431784b17fb3e1e79adada7ee73570efdb04b07afed9f41343ffaa3e3981c27e3a35181619a7e6ac61e7a0146515837a6bc5a86bc2f17fc4a9610fc22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reflectgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
