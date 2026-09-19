SUMMARY = "Documentation for texlive-hustvisual"
DESCRIPTION = "This package includes the documentation for texlive-hustvisual"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-hustvisual-doc-2026.226.1.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "d7bc720ae1b73f2dcc842727a4ea30ca76c0eaba7b2911427bac86a7be94f3b73a5a11e289ce889c24902c50f980eb764557f6e11c06929975f1a03cc9c5d623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hustvisual-doc"

RDEPENDS:${PN} += ""

inherit rpm
