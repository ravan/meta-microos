SUMMARY = "Documentation for texlive-ibrackets"
DESCRIPTION = "This package includes the documentation for texlive-ibrackets"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn67736"

RPM_NAME = "texlive-ibrackets-doc-2026.226.1.2svn67736-60.2.noarch.rpm"
RPM_HASH = "984b5d13faffbf9d7a63fd3dadb5f460423dea6f42b77fc148a0e2bc8856bbc72cecd27aaaf1b03ae11a9d10410d0c48de1a43086bcf2aca1ed539c2c4a935b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibrackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
