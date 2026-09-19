SUMMARY = "Documentation for texlive-tikz-ext"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ext"
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.0.0.6.2svn75014"

RPM_NAME = "texlive-tikz-ext-doc-2026.226.0.0.6.2svn75014-59.2.noarch.rpm"
RPM_HASH = "e2ec267931570a512a830cf8a18f1f2cc03fd2bbd5ccb49a76fa633be3790fcfa1c8296e2306cef24bd1970f8c393bace2690f807097b5c968227e9e38bfd4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
