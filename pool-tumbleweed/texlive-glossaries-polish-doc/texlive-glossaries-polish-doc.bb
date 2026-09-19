SUMMARY = "Documentation for texlive-glossaries-polish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-polish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "1b57d2f627511244b9f8b87ceb059a194c63e7132cf583bf3052eafec4d95275baa562a781eefc4ade219a8cb4f1053e6e0590f50d87dbfeb9a2c43ede9a4a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
