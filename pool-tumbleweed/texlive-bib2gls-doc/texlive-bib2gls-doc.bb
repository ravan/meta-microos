SUMMARY = "Documentation for texlive-bib2gls"
DESCRIPTION = "This package includes the documentation for texlive-bib2gls"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.7svn76845"

RPM_NAME = "texlive-bib2gls-doc-2026.226.4.7svn76845-61.2.noarch.rpm"
RPM_HASH = "ff3b29085f27fd4716040d6929a1668e22e2cf9f90c50f118bc4774b7ab421cba7594c41832b37a82faacec3e31b9ba0da6544e1af07e49e8c966464df7ebd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bib2gls.1 \
man-convertgls2bib.1 \
man-datatool2bib.1 \
texlive-bib2gls-doc"

RDEPENDS:${PN} += ""

inherit rpm
