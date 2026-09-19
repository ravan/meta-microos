SUMMARY = "Documentation for texlive-xdoc"
DESCRIPTION = "This package includes the documentation for texlive-xdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-doc-2026.226.prot2.5svn15878-59.4.noarch.rpm"
RPM_HASH = "3a358a599a9baf0ac3488148d2750d413907c884bcba7c5b094590405e8beda6908947f1241b953f9f400df99e58a428e7a05bfa1b7d4c7ae8a91573802e7f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
