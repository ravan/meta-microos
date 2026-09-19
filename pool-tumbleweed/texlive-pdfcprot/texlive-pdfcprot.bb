SUMMARY = "Activating and setting of character protruding using pdfLaTeX"
DESCRIPTION = "This package provides an easy interface to adjust the character \
protrusion for different fonts and choosing the right \
adjustment automatically depending on the font. The package is \
largely superseded by microtype."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-2026.226.1.7asvn18735-58.2.noarch.rpm"
RPM_HASH = "d6740341426227937ccbd0ae86fea6e9d0b24f106c31cf37c2feacc21769578974c629cf884d4e0d6ea5598f55e8c0e53509fc83d5fd025f8474223e5219d09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcprot.sty \
texlive-pdfcprot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
