SUMMARY = "Documentation for texlive-phffullpagefigure"
DESCRIPTION = "This package includes the documentation for texlive-phffullpagefigure"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-doc-2026.226.1.0svn41857-58.2.noarch.rpm"
RPM_HASH = "be7273dbd57e254285045bf814745312c1992dbe3ddefbb7db89d41909ead1934e6d93d034c9d55f8e1dfa61ee40f9fb703a73315cf21d4171af1a8ca6a58557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phffullpagefigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
