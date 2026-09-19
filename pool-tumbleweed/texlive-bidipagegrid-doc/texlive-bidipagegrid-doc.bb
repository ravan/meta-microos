SUMMARY = "Documentation for texlive-bidipagegrid"
DESCRIPTION = "This package includes the documentation for texlive-bidipagegrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bidipagegrid-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "af2a25e5bd894e359f811084936be8f839054abc85c6772aa516a8b73a3781ce386233cd00b3bb8dcaf4d7ee83fc95a610ec8bb9b2f54cdc7b403d0c938430ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
