SUMMARY = "Documentation for texlive-biblatex-ajc2020unofficial"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ajc2020unofficial"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-doc-2026.226.0.0.2.0svn54401-61.2.noarch.rpm"
RPM_HASH = "00304927c6f3cc9c1dfa566a5a3302b9e19ee818e933e434b1b7c0551adbedc139d00919d0cf41142a035f42eff0e701a98d89d76b65afd2d14ae3e0b1e1d53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ajc2020unofficial-doc"

RDEPENDS:${PN} += ""

inherit rpm
