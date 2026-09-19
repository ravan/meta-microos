SUMMARY = "Documentation for texlive-textfit"
DESCRIPTION = "This package includes the documentation for texlive-textfit"
LICENSE = "LPPL-1.0"

PV = "2026.227.5svn20591"

RPM_NAME = "texlive-textfit-doc-2026.227.5svn20591-62.2.noarch.rpm"
RPM_HASH = "ef84a591708cbeae7f2360e30a58b6d4cfc717d52965341775dee9929a1a2510993a7093e128700cfb1663b10cdc172c04637aad822ed21a61ee711810fe292e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textfit-doc"

RDEPENDS:${PN} += ""

inherit rpm
