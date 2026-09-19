SUMMARY = "Documentation for texlive-lt3graph"
DESCRIPTION = "This package includes the documentation for texlive-lt3graph"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn76924"

RPM_NAME = "texlive-lt3graph-doc-2026.226.0.0.1.9svn76924-59.2.noarch.rpm"
RPM_HASH = "154fd2d849d896bf11f2fb89b7ce367505a2822839e9f7482d673920f3143c668e3d5a89deedb6647e14d4c5b336b59ada1131aa616c744e919a194b4a42cc30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3graph-doc"

RDEPENDS:${PN} += ""

inherit rpm
