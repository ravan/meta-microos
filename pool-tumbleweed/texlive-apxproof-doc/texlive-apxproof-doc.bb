SUMMARY = "Documentation for texlive-apxproof"
DESCRIPTION = "This package includes the documentation for texlive-apxproof"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.6svn76507"

RPM_NAME = "texlive-apxproof-doc-2026.226.1.2.6svn76507-61.2.noarch.rpm"
RPM_HASH = "eb65f174364ced13ec49e0f6adfcbc559ac3188c047f67a4f53f71758bdd1a55c066c7001bb80408359f5c4f1e27cd033219233420e8ee3eb34e61b75d2c3b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apxproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
