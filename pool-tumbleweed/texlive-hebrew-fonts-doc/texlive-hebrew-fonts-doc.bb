SUMMARY = "Documentation for texlive-hebrew-fonts"
DESCRIPTION = "This package includes the documentation for texlive-hebrew-fonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn68038"

RPM_NAME = "texlive-hebrew-fonts-doc-2026.226.1.3svn68038-60.4.noarch.rpm"
RPM_HASH = "031b781841604d4c6983c1b4174ad92e50b494aed4e269fa9a8ea7f27007d914fa5fe4ad596bc67e93a1b55851a21a390045e7a9ad72ad126232b2a609a55d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hebrew-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
