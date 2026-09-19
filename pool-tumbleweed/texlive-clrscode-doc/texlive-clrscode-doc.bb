SUMMARY = "Documentation for texlive-clrscode"
DESCRIPTION = "This package includes the documentation for texlive-clrscode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn51136"

RPM_NAME = "texlive-clrscode-doc-2026.226.1.7svn51136-60.2.noarch.rpm"
RPM_HASH = "b761577126436a7a4c5ffd9c50fb82fc429bb3d89fc71666788626af36a7cebc2789ab3fc059c356510a0bcbbee5371f21fee54f6f5dea8356801197e7df6b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode-doc"

RDEPENDS:${PN} += ""

inherit rpm
