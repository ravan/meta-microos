SUMMARY = "Documentation for texlive-keyindex"
DESCRIPTION = "This package includes the documentation for texlive-keyindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn50828"

RPM_NAME = "texlive-keyindex-doc-2026.226.1.0svn50828-63.2.noarch.rpm"
RPM_HASH = "a3fb5019521e33ef203643f335f236fdc3900e1662e884647abfe183bb1e67ffd4e3e2e570272e18901872cd773e66dbc4bbe5c5554478f6663690e64197fc8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
