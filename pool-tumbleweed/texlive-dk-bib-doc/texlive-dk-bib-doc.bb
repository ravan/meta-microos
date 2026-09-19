SUMMARY = "Documentation for texlive-dk-bib"
DESCRIPTION = "This package includes the documentation for texlive-dk-bib"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn76790"

RPM_NAME = "texlive-dk-bib-doc-2026.226.0.0.6svn76790-59.2.noarch.rpm"
RPM_HASH = "dfa849125871111e55379afafb0442c6c239bb47203c5ff455c539336ff5274467f8dcb164009b8df123ad7bdb9dfd8c8b695590e7d3fc6f1270b195046788de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dk-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
