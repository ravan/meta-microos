SUMMARY = "Documentation for texlive-rebuttal"
DESCRIPTION = "This package includes the documentation for texlive-rebuttal"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn72851"

RPM_NAME = "texlive-rebuttal-doc-2026.226.0.0.1.1svn72851-60.4.noarch.rpm"
RPM_HASH = "6a066382e6377bbb934db7b161573b1feae69d3854b3bea06735b39813730dd819924fc78b7dca3a0f3fb5fd775e6853a8c36056330f5be1b5a141fda6a72c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rebuttal-doc"

RDEPENDS:${PN} += ""

inherit rpm
