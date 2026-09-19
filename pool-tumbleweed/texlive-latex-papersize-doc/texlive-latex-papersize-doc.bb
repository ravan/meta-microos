SUMMARY = "Documentation for texlive-latex-papersize"
DESCRIPTION = "This package includes the documentation for texlive-latex-papersize"
LICENSE = "Apache-1.0"

PV = "2026.226.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-doc-2026.226.1.63svn53131-63.2.noarch.rpm"
RPM_HASH = "d050d7aa8796eff920de8b23db13a3d1343cd5b83744f3a4e762f0462c802142cc7d8f4f7a748585d7f29f0d7cc2124a91930cef23d47e77e977e7236adfccfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
