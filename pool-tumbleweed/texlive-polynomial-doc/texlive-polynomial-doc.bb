SUMMARY = "Documentation for texlive-polynomial"
DESCRIPTION = "This package includes the documentation for texlive-polynomial"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-polynomial-doc-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "1a4543024a461bb01fee895d86df2e5c0579c4ea097bf5cf9924afc52306c0924cbdb81aa10477238f44823a9927296c879a39c099a0f46c32940a83e17e1b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynomial-doc"

RDEPENDS:${PN} += ""

inherit rpm
