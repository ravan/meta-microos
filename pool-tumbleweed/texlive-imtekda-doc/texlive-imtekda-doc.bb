SUMMARY = "Documentation for texlive-imtekda"
DESCRIPTION = "This package includes the documentation for texlive-imtekda"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn17667"

RPM_NAME = "texlive-imtekda-doc-2026.226.1.7svn17667-60.2.noarch.rpm"
RPM_HASH = "1dbb00aecfc7ac86ee2fc16af387856088ba6bcaa4728d8a6369b2d394f04675815223f8462c7782efb6055b0082e3d4ae8f735d3bd6430fd55d450683f1dcc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-imtekda-doc-de \
texlive-imtekda-doc"

RDEPENDS:${PN} += ""

inherit rpm
