SUMMARY = "Documentation for texlive-colordoc"
DESCRIPTION = "This package includes the documentation for texlive-colordoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18270"

RPM_NAME = "texlive-colordoc-doc-2026.226.svn18270-60.2.noarch.rpm"
RPM_HASH = "c9481278d458ac6e705f83eed9ab084c425c87f88f3a6e2609cb88ae974c84305d59d37614be4145b5dca0a4a768123d34b777d2ece03b5b0fb8356312fccda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colordoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
