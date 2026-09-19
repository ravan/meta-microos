SUMMARY = "Documentation for texlive-tblr-extras"
DESCRIPTION = "This package includes the documentation for texlive-tblr-extras"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn76924"

RPM_NAME = "texlive-tblr-extras-doc-2026.227.1.3svn76924-62.2.noarch.rpm"
RPM_HASH = "dfc284ed713613024b5c1f31443ce3ee08c6d3f906ca1d8325a2da166f36b058d71ae3ba0e5bfeff76f7e5ae8a2e86438a46b7eb89f815354a770e391a8c80a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tblr-extras-doc"

RDEPENDS:${PN} += ""

inherit rpm
