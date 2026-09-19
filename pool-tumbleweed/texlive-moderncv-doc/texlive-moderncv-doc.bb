SUMMARY = "Documentation for texlive-moderncv"
DESCRIPTION = "This package includes the documentation for texlive-moderncv"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.1svn77552"

RPM_NAME = "texlive-moderncv-doc-2026.226.2.5.1svn77552-61.2.noarch.rpm"
RPM_HASH = "1d384e13339976c9b6f572ff50998fb43fb46b30fa838e12bd04fcc3b9e6852ae714cdb96ab3acc402185fcd20fc0d5139af0dbc15514020cd2cef1de9a5acf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderncv-doc"

RDEPENDS:${PN} += ""

inherit rpm
