SUMMARY = "Documentation for texlive-hecthese"
DESCRIPTION = "This package includes the documentation for texlive-hecthese"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn68584"

RPM_NAME = "texlive-hecthese-doc-2026.226.2.0svn68584-60.4.noarch.rpm"
RPM_HASH = "b3727c44f6852524f7968541599debadd40305bf4f57984f060656a2992682e5c087264b958e26eb512b1827d0e8120cc9ede4b27435987160c13b965e916474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hecthese-doc-en;fr \
texlive-hecthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
