SUMMARY = "Documentation for texlive-tipfr"
DESCRIPTION = "This package includes the documentation for texlive-tipfr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn38646"

RPM_NAME = "texlive-tipfr-doc-2026.226.1.5svn38646-59.2.noarch.rpm"
RPM_HASH = "3080d44e231a2144c55f6ab39de1a498312cc93fb4ebd395b73d69859326b9672e18725869309a7b40ec1ead15445646d3ee94f1914236b3b6bacc717142f741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tipfr-doc-fr \
texlive-tipfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
