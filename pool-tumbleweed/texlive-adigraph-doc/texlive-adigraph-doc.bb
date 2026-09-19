SUMMARY = "Documentation for texlive-adigraph"
DESCRIPTION = "This package includes the documentation for texlive-adigraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.2svn70422"

RPM_NAME = "texlive-adigraph-doc-2026.226.1.7.2svn70422-61.2.noarch.rpm"
RPM_HASH = "f47b5ef159d0e7f220612ecd0eee273c23494db5bac2d9a6e3bc7f02cb7c3043e1fe603bf38241ab6909f15a1ed960fd5c408b08ceb9b65776b8bd5704286fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
