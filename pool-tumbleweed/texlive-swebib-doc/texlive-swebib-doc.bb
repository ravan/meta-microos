SUMMARY = "Documentation for texlive-swebib"
DESCRIPTION = "This package includes the documentation for texlive-swebib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-swebib-doc-2026.226.svn76924-64.2.noarch.rpm"
RPM_HASH = "9d235d82551bef8a443e9a2455af0c500925e4dfcef86c508d894d977e4f0c83cd63671fe621b2ba10212a7e4d11dd24014e61f85b42d68207ddec1732ddaf5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
