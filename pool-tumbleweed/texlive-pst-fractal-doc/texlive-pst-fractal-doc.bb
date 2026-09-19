SUMMARY = "Documentation for texlive-pst-fractal"
DESCRIPTION = "This package includes the documentation for texlive-pst-fractal"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-doc-2026.226.0.0.12svn64714-59.2.noarch.rpm"
RPM_HASH = "84b418e0118db5da21775e5dfb19a5134130a11c1fbc37623757414f0c9c3f1a5265b8a43b209be65aafd00bbd52819b77c4f8c6f17f94ea177ffa86a161b6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fractal-doc"

RDEPENDS:${PN} += ""

inherit rpm
