SUMMARY = "Documentation for texlive-scrabble"
DESCRIPTION = "This package includes the documentation for texlive-scrabble"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77114"

RPM_NAME = "texlive-scrabble-doc-2026.226.0.0.20asvn77114-60.2.noarch.rpm"
RPM_HASH = "69ab1d6dd7a350a00e9cf3150aa72b7444795eb7839bb56048d69878c83d52a31830626693a2608df18bdbff33edd702837b970866915f0a3d30a3bffbff3965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scrabble-doc-fr \
texlive-scrabble-doc"

RDEPENDS:${PN} += ""

inherit rpm
