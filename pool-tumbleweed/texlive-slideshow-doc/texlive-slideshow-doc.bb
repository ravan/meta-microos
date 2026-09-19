SUMMARY = "Documentation for texlive-slideshow"
DESCRIPTION = "This package includes the documentation for texlive-slideshow"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-slideshow-doc-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "b6ca2868d3066c0309a32ec6c7ade90172e0bc8caf51c9051801fd9040e500accfe87f224b586c168855c89e91e0081462f5627b71d8c54e0899c7e8cee57621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow-doc"

RDEPENDS:${PN} += ""

inherit rpm
