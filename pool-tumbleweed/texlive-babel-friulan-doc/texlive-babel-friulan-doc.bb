SUMMARY = "Documentation for texlive-babel-friulan"
DESCRIPTION = "This package includes the documentation for texlive-babel-friulan"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-babel-friulan-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "afd5b8a9fa7177ceb07d3fdb11e8974ceb10a742b061360efa71755581d5cc15b0814ea051373475d14eece13c31506a1cccf0d691bedad3929e7c719298d6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-friulan-doc"

RDEPENDS:${PN} += ""

inherit rpm
