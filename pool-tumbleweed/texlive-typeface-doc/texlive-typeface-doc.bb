SUMMARY = "Documentation for texlive-typeface"
DESCRIPTION = "This package includes the documentation for texlive-typeface"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn27046"

RPM_NAME = "texlive-typeface-doc-2026.226.0.0.1svn27046-59.2.noarch.rpm"
RPM_HASH = "74a0bf536e5cafd5e4f1bd85e294d1d98725811e738d86dd60d8a1706138669906eca03a5c58ddc8e6c06e66053d4dc59c56c0a185f5120b1223efac326ce964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeface-doc"

RDEPENDS:${PN} += ""

inherit rpm
