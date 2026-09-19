SUMMARY = "Documentation for texlive-association-matrix"
DESCRIPTION = "This package includes the documentation for texlive-association-matrix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-association-matrix-doc-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "bccbec55e871fcaa7d80b2c489bf8a2115bd3b5de5cbfb365e79597abc4d0db27ca2d4d3e9151566e96b7250a759640348b0cbed142e8993421a71e030f5b394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-association-matrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
