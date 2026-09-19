SUMMARY = "Documentation for texlive-biblatex-mla"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-mla"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1asvn62138"

RPM_NAME = "texlive-biblatex-mla-doc-2026.226.2.1asvn62138-61.2.noarch.rpm"
RPM_HASH = "62f4005fa8df413c731258511df1fdf221466e80c1deb47d029001ff39d9eeb0ba1199a3d4556808e259f4a2cd9e92949121c793bf750b69ae49a690e60f636a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-mla-doc"

RDEPENDS:${PN} += ""

inherit rpm
