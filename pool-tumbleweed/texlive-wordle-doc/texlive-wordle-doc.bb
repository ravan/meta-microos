SUMMARY = "Documentation for texlive-wordle"
DESCRIPTION = "This package includes the documentation for texlive-wordle"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn72059"

RPM_NAME = "texlive-wordle-doc-2026.226.0.0.3.0svn72059-60.2.noarch.rpm"
RPM_HASH = "c26c6f74d032ee08431a24c893f50a950860e3ab51eef4530e6fb3322f2ff6929bb2d565239b8529eed534e5b59d23ffc7c661e3c200c7ce4f64fa03e369a77c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wordle-doc-fr \
texlive-wordle-doc"

RDEPENDS:${PN} += ""

inherit rpm
