SUMMARY = "Documentation for texlive-liturg"
DESCRIPTION = "This package includes the documentation for texlive-liturg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-liturg-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "a8f26808120000534f86744ed5db8d3575d984d2e50a86923998e72e5b71396e02e16b9492473b0f6adda1e08d0f4ad6bde34a70dfa153bf599a9ab093f813c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liturg-doc"

RDEPENDS:${PN} += ""

inherit rpm
