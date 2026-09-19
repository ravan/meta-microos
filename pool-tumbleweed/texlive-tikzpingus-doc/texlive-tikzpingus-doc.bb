SUMMARY = "Documentation for texlive-tikzpingus"
DESCRIPTION = "This package includes the documentation for texlive-tikzpingus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78219"

RPM_NAME = "texlive-tikzpingus-doc-2026.226.1.4svn78219-59.2.noarch.rpm"
RPM_HASH = "e46307ac18017b677c5ee8850a337e12ef78a4b8e37a421a3e4efaacd158003a240be2fecfb06ffa7287b9a93873384d801f3525ab7f92e20a0697d94bcdfbb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpingus-doc"

RDEPENDS:${PN} += ""

inherit rpm
