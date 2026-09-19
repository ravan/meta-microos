SUMMARY = "Documentation for texlive-ucdavisthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucdavisthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-doc-2026.226.1.3svn40772-59.2.noarch.rpm"
RPM_HASH = "f766d2717ad05e29f61627608c000c849a91e512c199955762107e8588211bd36df32a748583beed5a6f9fbdd2629ec656ceb518d4d1af6cef912820ee51b6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucdavisthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
