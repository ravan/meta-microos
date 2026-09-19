SUMMARY = "IMTEK thesis class"
DESCRIPTION = "The class permits typesetting of diploma, bachelor's and \
master's theses for the Institute of Microsystem Technology \
(IMTEK) at the University of Freiburg (Germany). The class is \
based on the KOMA-Script class scrbook. Included in the \
documentation is a large collection of useful tips for \
typesetting theses and a list of recommended packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn17667"

RPM_NAME = "texlive-imtekda-2026.226.1.7svn17667-60.2.noarch.rpm"
RPM_HASH = "90c3329e22e17940e1151826cbd293a7d81df9e0c6d94fadd02789e2e00bfd95e1d84d3face2b8cb84cb21532ea9e524c66ca585957a8c76b44287c4c210d35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IMTEKda.cls \
texlive-imtekda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-scrbook.cls \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
