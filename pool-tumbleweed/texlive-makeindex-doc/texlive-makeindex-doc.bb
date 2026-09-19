SUMMARY = "Documentation for texlive-makeindex"
DESCRIPTION = "This package includes the documentation for texlive-makeindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-makeindex-doc-2026.226.svn75712-59.2.noarch.rpm"
RPM_HASH = "9807f3582fd007bb2ee1f6612c963536ec6da5284627f0eae93466f76089d04acc853ed1f54a390031773a3cd15d7e8d26f7423baf3a39dc65935034aad15cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeindex.1 \
man-mkindex.1 \
texlive-makeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
