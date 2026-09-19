SUMMARY = "Documentation for texlive-hexgame"
DESCRIPTION = "This package includes the documentation for texlive-hexgame"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hexgame-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "e1b034ee9996fe9db39cb94fd03c4bed4e8965e5972ebaf2eaa4789772855c5340044933052d1335bdc539d66463ad2af2fd118ab76ae8ac0862e866d88d32cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
