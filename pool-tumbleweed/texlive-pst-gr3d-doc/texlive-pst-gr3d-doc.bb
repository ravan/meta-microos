SUMMARY = "Documentation for texlive-pst-gr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-gr3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-doc-2026.226.1.34svn15878-59.2.noarch.rpm"
RPM_HASH = "18cf8e636f07cac5eb2c6ce91e91792a15292d0cc527d6f2034891e0b81fe28bd1df379dfe57288306ea2b8f45c64084cbfe8275bafb7bd39cb49207171f9940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
