SUMMARY = "Documentation for texlive-biblatex-dw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-dw"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7bsvn77682"

RPM_NAME = "texlive-biblatex-dw-doc-2026.226.1.7bsvn77682-61.2.noarch.rpm"
RPM_HASH = "418a02709ada22916629bd81c9e4b2f99a97ed42d3971227fed4041ade6008e42724b2bb3b71d692816d7044313c0ad95ad051e968ccdcb7f8a9d5841e02b578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-dw-doc-de;en \
texlive-biblatex-dw-doc"

RDEPENDS:${PN} += ""

inherit rpm
