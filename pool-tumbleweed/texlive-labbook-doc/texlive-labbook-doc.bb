SUMMARY = "Documentation for texlive-labbook"
DESCRIPTION = "This package includes the documentation for texlive-labbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-labbook-doc-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "b6f116f469af968cf51a92473a9b1c4413efa1cac1767cf78e8e7141bca4e030fb367e8c3dd15d37924f0b7309c4d98dce6e78d5cd17703ae735d518a2636dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-labbook-doc-de;en \
texlive-labbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
