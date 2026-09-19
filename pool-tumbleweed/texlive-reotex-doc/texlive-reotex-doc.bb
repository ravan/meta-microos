SUMMARY = "Documentation for texlive-reotex"
DESCRIPTION = "This package includes the documentation for texlive-reotex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn34924"

RPM_NAME = "texlive-reotex-doc-2026.226.1.1svn34924-60.4.noarch.rpm"
RPM_HASH = "e5fb42dbc6a91e76d4204dc1ba8f30f56275327f53bd3d5970bdd6b4ac3c814fe9a8c14e7222b91f5743d1373c91e015c4fb50fe9f474a006f74e7c31ae1b4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
