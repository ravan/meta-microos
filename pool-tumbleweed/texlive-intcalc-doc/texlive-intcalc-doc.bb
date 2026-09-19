SUMMARY = "Documentation for texlive-intcalc"
DESCRIPTION = "This package includes the documentation for texlive-intcalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-intcalc-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "2b14af896f792874fa189f1a98895dbfac627949eb50e1746717e63112ee47a18a595eb365f3bbafa45375e4a03d7d3d5408c5d4e6fbd0efb141de585e50d58b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
