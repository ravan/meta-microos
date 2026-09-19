SUMMARY = "Documentation for texlive-isodoc"
DESCRIPTION = "This package includes the documentation for texlive-isodoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn75787"

RPM_NAME = "texlive-isodoc-doc-2026.226.1.16svn75787-63.2.noarch.rpm"
RPM_HASH = "27a864c4cf73bae71aea0174b95328760d4d080f8d927425994c81e1ab57f17720bf3cf8ea7038ecb0e964d88cdff8409913a47ec175dd601409201b745a83df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
