SUMMARY = "Documentation for texlive-biblatex-opcit-booktitle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-opcit-booktitle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.0svn76790"

RPM_NAME = "texlive-biblatex-opcit-booktitle-doc-2026.226.1.9.0svn76790-61.2.noarch.rpm"
RPM_HASH = "6ec41dfc3554a3d11ab2fcd5936040b69caf83b23813fe2852b9c2a9ac83701f057ea5f7c0eecbc6365e545094f665b7af8d25b811f532f902d22028e602c285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-opcit-booktitle-doc"

RDEPENDS:${PN} += ""

inherit rpm
