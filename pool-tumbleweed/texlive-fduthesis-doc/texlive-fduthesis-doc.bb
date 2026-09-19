SUMMARY = "Documentation for texlive-fduthesis"
DESCRIPTION = "This package includes the documentation for texlive-fduthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9asvn67231"

RPM_NAME = "texlive-fduthesis-doc-2026.226.0.0.9asvn67231-59.2.noarch.rpm"
RPM_HASH = "3cc6d97e1aa2daabc56582c0ec83179ddaf1c04b9c450b5595f94690cb5581971b7724290cc6ee3bfdc1a5ea5f6d83c8a332374bca246434e2dfff8a3dc90bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fduthesis-doc-zh;en \
texlive-fduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
