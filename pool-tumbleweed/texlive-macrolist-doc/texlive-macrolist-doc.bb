SUMMARY = "Documentation for texlive-macrolist"
DESCRIPTION = "This package includes the documentation for texlive-macrolist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-doc-2026.226.2.1.0svn60139-59.2.noarch.rpm"
RPM_HASH = "d212c4f84bd1a076ffcc929bb59acc69300dd8f431ee5496e839f02002d0461131fd9a7e9c250db45cc325448940a6ce6109a99e744ee1c3fa562c6d765ebd08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macrolist-doc"

RDEPENDS:${PN} += ""

inherit rpm
