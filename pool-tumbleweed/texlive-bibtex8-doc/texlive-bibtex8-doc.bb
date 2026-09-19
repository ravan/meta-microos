SUMMARY = "Documentation for texlive-bibtex8"
DESCRIPTION = "This package includes the documentation for texlive-bibtex8"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-bibtex8-doc-2026.226.svn75712-61.2.noarch.rpm"
RPM_HASH = "7687677e242b88aa5aa4961e726534c01d4546fc06635308ff054149ebcab3feefb482685613fbb2cecb880477e3d61187850f7de477e15c11f58a2a8fd0cc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex8.1 \
texlive-bibtex8-doc"

RDEPENDS:${PN} += ""

inherit rpm
