SUMMARY = "Documentation for texlive-exercisebank"
DESCRIPTION = "This package includes the documentation for texlive-exercisebank"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-doc-2026.226.0.0.3.0svn50448-59.2.noarch.rpm"
RPM_HASH = "80812dcd0abb098dde5a6d1a7b696d971aa2fcaa80986d48af9f5188a552a8f8651dca7bfa8501e576a4d0574c1447c6de798ddf77082bc09f532d73d6b7d3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisebank-doc"

RDEPENDS:${PN} += ""

inherit rpm
