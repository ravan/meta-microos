SUMMARY = "Documentation for texlive-schulmathematik"
DESCRIPTION = "This package includes the documentation for texlive-schulmathematik"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn76924"

RPM_NAME = "texlive-schulmathematik-doc-2026.226.1.7.1svn76924-60.2.noarch.rpm"
RPM_HASH = "f3344295f674e665c5272b66cd6aebee41e25319ce52072a2b541052d4b25c0dcd32d65c166c7de2e7111fb3d4e7dd0128a8eefb5b84c6e8dc6569d45974d6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schulmathematik-doc-de \
texlive-schulmathematik-doc"

RDEPENDS:${PN} += ""

inherit rpm
