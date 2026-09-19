SUMMARY = "Documentation for texlive-hobete"
DESCRIPTION = "This package includes the documentation for texlive-hobete"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn27036"

RPM_NAME = "texlive-hobete-doc-2026.226.svn27036-60.4.noarch.rpm"
RPM_HASH = "91a0246e7e7f4a42261c5467bff2ca3c261f2ecbbab2f070303d5fbad5794c87daf9e44a81a41d65ed09ed655f0e96a508dd425fcd0c808d8c01541f40b40bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hobete-doc-de \
texlive-hobete-doc"

RDEPENDS:${PN} += ""

inherit rpm
