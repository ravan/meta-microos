SUMMARY = "Documentation for texlive-latex-firstaid-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-firstaid-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-firstaid-dev-doc-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "281f6714ff44e08817861ea63302601a0f486003fec6e0ba1be0e0969e06040501d2269931c33b118dcb0c45223d69d32c7b9c64069a445004d0188e483fa085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-firstaid-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
