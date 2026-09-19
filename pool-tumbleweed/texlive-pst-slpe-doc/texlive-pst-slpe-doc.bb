SUMMARY = "Documentation for texlive-pst-slpe"
DESCRIPTION = "This package includes the documentation for texlive-pst-slpe"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-doc-2026.226.1.31svn24391-60.4.noarch.rpm"
RPM_HASH = "e10a44bfaa765093fe78357309166dea48459d56250d02fc2cd85bce97f507d0a2ac9c17d66d547c1cc25ce4f85028ee1c7d416ff2d691721ec6ade0750e1b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-slpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
