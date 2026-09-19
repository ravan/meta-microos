SUMMARY = "Documentation for texlive-fixcmex"
DESCRIPTION = "This package includes the documentation for texlive-fixcmex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn51825"

RPM_NAME = "texlive-fixcmex-doc-2026.226.1.1svn51825-59.2.noarch.rpm"
RPM_HASH = "952614cc336a7e11ff91ac762199aa642dcc9fcc5647319b9d269aa4b498e398bcf63937dafe1e9e48bb423289d8ee15fb33cc2a6134a413d777c8af7498e125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixcmex-doc"

RDEPENDS:${PN} += ""

inherit rpm
