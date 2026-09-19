SUMMARY = "Documentation for texlive-tikz-dependency"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dependency"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-doc-2026.227.1.2svn54512-62.2.noarch.rpm"
RPM_HASH = "d26be588ed15c0ee68f91db71af80d404b17b63df7a6db627a50a0edf88d2ac826d61b004b95016285cac21d333ec7b0bceb241633eb4dbf1c514d3c9489d0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dependency-doc"

RDEPENDS:${PN} += ""

inherit rpm
