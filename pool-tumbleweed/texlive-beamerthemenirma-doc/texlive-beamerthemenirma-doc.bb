SUMMARY = "Documentation for texlive-beamerthemenirma"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemenirma"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-doc-2026.226.0.0.1svn20765-61.2.noarch.rpm"
RPM_HASH = "f2d3b933002f15ab4d79e6701512f03e01dfc5c4ff50b701c59f463cfb7b7fe24eb098e1a65b8033251e55570855be5772acf4c5b520a87e57488597280221c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemenirma-doc"

RDEPENDS:${PN} += ""

inherit rpm
