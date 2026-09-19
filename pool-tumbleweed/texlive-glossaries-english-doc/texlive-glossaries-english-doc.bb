SUMMARY = "Documentation for texlive-glossaries-english"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-english"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "2f6acac1572a84fde0edf78e1620d3a98ff88a2538350fdffd04b1abfb803f70407801a25a9597c2e8d1299ecebd303bef7a43188d602e54177cb47ca09f6029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
