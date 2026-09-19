SUMMARY = "Documentation for texlive-pst-plot"
DESCRIPTION = "This package includes the documentation for texlive-pst-plot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.94svn77682"

RPM_NAME = "texlive-pst-plot-doc-2026.226.1.94svn77682-60.4.noarch.rpm"
RPM_HASH = "45c42348c5fcf5ab55f60ca37463fe065ee1f422501e43db462af6fac8b1228236c1408f958b2901e4924c8ca7671296221a3ef130911a3a89dc52939a28555f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-plot-doc-en \
texlive-pst-plot-doc"

RDEPENDS:${PN} += ""

inherit rpm
