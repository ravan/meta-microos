SUMMARY = "Documentation for texlive-titlepic"
DESCRIPTION = "This package includes the documentation for texlive-titlepic"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn43497"

RPM_NAME = "texlive-titlepic-doc-2026.226.1.2svn43497-59.2.noarch.rpm"
RPM_HASH = "d7a27931290471ea8954759345ad53a3122c02857376b4df2f954d7164379d639ee0fb856524b93bb23ca94abd9dff5d770afe599518d9d17ed2aab557e0f695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepic-doc"

RDEPENDS:${PN} += ""

inherit rpm
