SUMMARY = "Documentation for texlive-randbild"
DESCRIPTION = "This package includes the documentation for texlive-randbild"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-randbild-doc-2026.226.0.0.2svn15878-60.4.noarch.rpm"
RPM_HASH = "ebb318bf900359644472feccbbc91dc690f92f249ff8ef969ff3084acc8f6f98ab5a0322c6fcdcdeb72c4977289418b769774127ad41572bcd62dc4bd1c35d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-randbild-doc-de \
texlive-randbild-doc"

RDEPENDS:${PN} += ""

inherit rpm
