SUMMARY = "Documentation for texlive-pgf-blur"
DESCRIPTION = "This package includes the documentation for texlive-pgf-blur"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-doc-2026.226.1.02svn54512-58.2.noarch.rpm"
RPM_HASH = "9e9b7adf1a9bffe8f874832516a8d2e788c06f143fc338eb3305e11c7e6273a6b0009020c481f950791df000e835b9c439c87bca8e9ed76a95297fe42aed4643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm
