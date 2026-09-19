SUMMARY = "Documentation for texlive-pst-fun"
DESCRIPTION = "This package includes the documentation for texlive-pst-fun"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-doc-2026.226.0.0.04svn17909-59.2.noarch.rpm"
RPM_HASH = "974f6e01ccd7b6f235fcb72cc96260115f3e3f8d25e2de18a71664bf8a7503cc13a84c30fb033a8d75465e00162d0e933febcf00520f856c060902d8dde18485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fun-doc"

RDEPENDS:${PN} += ""

inherit rpm
