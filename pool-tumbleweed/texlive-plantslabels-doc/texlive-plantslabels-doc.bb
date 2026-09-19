SUMMARY = "Documentation for texlive-plantslabels"
DESCRIPTION = "This package includes the documentation for texlive-plantslabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29803"

RPM_NAME = "texlive-plantslabels-doc-2026.226.1.0svn29803-58.2.noarch.rpm"
RPM_HASH = "811790ba1049c8a12987e616e18a5d2e50801dda069d45425a8fc2306b1949790ae958dd787c491f804b48b70075c6c980f9fd90fb90e15b442ad781db1ad81d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantslabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
