SUMMARY = "Documentation for texlive-tikzmarmots"
DESCRIPTION = "This package includes the documentation for texlive-tikzmarmots"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn76924"

RPM_NAME = "texlive-tikzmarmots-doc-2026.226.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "642d229f0403f729cc1efadc1a0aba448a1911ada6c56831b25c794fe3d879468e6ce8a7952ff988b12c16ac71c05e044989aa95aab885e1e05e9a778acff9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmarmots-doc"

RDEPENDS:${PN} += ""

inherit rpm
