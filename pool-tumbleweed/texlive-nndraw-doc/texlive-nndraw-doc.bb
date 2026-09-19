SUMMARY = "Documentation for texlive-nndraw"
DESCRIPTION = "This package includes the documentation for texlive-nndraw"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59674"

RPM_NAME = "texlive-nndraw-doc-2026.226.1.0svn59674-61.2.noarch.rpm"
RPM_HASH = "79184fb4b5f0a71985cb70811a1350ff5cf81e61ceffc8c7283cca46847f14ed068b91977cd79277919cf4f98386ef9702c40ac62a6775e30b3b195a6a2fff10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nndraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
