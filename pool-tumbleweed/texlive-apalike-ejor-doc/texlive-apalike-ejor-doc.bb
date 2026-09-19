SUMMARY = "Documentation for texlive-apalike-ejor"
DESCRIPTION = "This package includes the documentation for texlive-apalike-ejor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76790"

RPM_NAME = "texlive-apalike-ejor-doc-2026.226.1.2.0svn76790-61.2.noarch.rpm"
RPM_HASH = "f86b904aa2fca33f239833571847dcce510ca31739ba270701e6a7d7689d147f8d53178ab58cd117fd12f48fbd67cdbac834b7d2861bb75915b070df20789809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor-doc"

RDEPENDS:${PN} += ""

inherit rpm
