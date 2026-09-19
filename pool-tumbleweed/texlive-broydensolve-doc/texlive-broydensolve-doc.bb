SUMMARY = "Documentation for texlive-broydensolve"
DESCRIPTION = "This package includes the documentation for texlive-broydensolve"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-broydensolve-doc-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "df15e0ae3303ba0c53549fab369cec71c915aa4c317e4056cf9dc230384ac4c5f6856892bb54a49bb721d3967cb1a2b3cc8ed8c92f3c77bb49513ca525aa2bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-broydensolve-doc"

RDEPENDS:${PN} += ""

inherit rpm
