SUMMARY = "Documentation for texlive-bxjaholiday"
DESCRIPTION = "This package includes the documentation for texlive-bxjaholiday"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76924"

RPM_NAME = "texlive-bxjaholiday-doc-2026.226.1.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "304ab922567a91982acdf36eb5abeaaec6d3f6d65bb653b2ec12977fccac211a7a04480ee3f84378559979862023e1f428e1e50eb4312e32df64fa63f42da53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjaholiday-doc-ja \
texlive-bxjaholiday-doc"

RDEPENDS:${PN} += ""

inherit rpm
