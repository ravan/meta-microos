SUMMARY = "Documentation for texlive-ctanify"
DESCRIPTION = "This package includes the documentation for texlive-ctanify"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.1svn44129"

RPM_NAME = "texlive-ctanify-doc-2026.226.1.9.1svn44129-61.2.noarch.rpm"
RPM_HASH = "414b039ea8b84bd03e21660746d194fc5de603998619526129fa5767e6c0f9fe5ebb1b61ea1e572a44b44fc0ff1f3264c9553ddfd82db0d84810221fe074c8ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctanify.1 \
texlive-ctanify-doc"

RDEPENDS:${PN} += ""

inherit rpm
