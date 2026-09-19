SUMMARY = "Documentation for texlive-pdfpc-movie"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc-movie"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67201"

RPM_NAME = "texlive-pdfpc-movie-doc-2026.226.1.0svn67201-58.2.noarch.rpm"
RPM_HASH = "842f09e1dcaf2885dfa30702858fa12608a28c2477b410097a4ab78ce6e0112f96b6d1d572c77dc74f10c02b7cd689ca9a7ae2658d429a3c6d2d248c5628498a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-movie-doc"

RDEPENDS:${PN} += ""

inherit rpm
