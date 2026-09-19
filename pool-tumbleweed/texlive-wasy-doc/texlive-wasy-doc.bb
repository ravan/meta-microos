SUMMARY = "Documentation for texlive-wasy"
DESCRIPTION = "This package includes the documentation for texlive-wasy"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.5svn53533"

RPM_NAME = "texlive-wasy-doc-2026.226.2.5svn53533-60.2.noarch.rpm"
RPM_HASH = "ceca7623dfe52d6925a063a6299c0a9617bb29c13d9f175f6785c2d97f9e4592418e88bd9b35d5707d5e18bfecac209dddbc6645543a088027c12907e870a352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
