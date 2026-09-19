SUMMARY = "Documentation for texlive-datax"
DESCRIPTION = "This package includes the documentation for texlive-datax"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn61772"

RPM_NAME = "texlive-datax-doc-2026.226.1.2.0svn61772-61.2.noarch.rpm"
RPM_HASH = "37928a46e8de2184484d3e011532cab92ae98da7f27b7e4c6a10831445a757dd003747329a0c7e450551b1ca40c032e5f025187e1374552ba318dc3af430834b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datax-doc"

RDEPENDS:${PN} += ""

inherit rpm
