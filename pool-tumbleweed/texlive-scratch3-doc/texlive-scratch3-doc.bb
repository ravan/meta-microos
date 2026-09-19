SUMMARY = "Documentation for texlive-scratch3"
DESCRIPTION = "This package includes the documentation for texlive-scratch3"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-doc-2026.226.0.0.19svn61921-60.2.noarch.rpm"
RPM_HASH = "f7c64b9ab24501d82f50e3b376d3cae48a28eb47370aa427303705df6eaea20e8c19eb576caef8091bd4f5910931d42b8d2df827ce500c1e98fe849859e99709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratch3-doc-fr \
texlive-scratch3-doc"

RDEPENDS:${PN} += ""

inherit rpm
