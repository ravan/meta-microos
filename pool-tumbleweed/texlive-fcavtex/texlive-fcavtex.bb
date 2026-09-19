SUMMARY = "A thesis class for the FCAV/UNESP (Brazil)"
DESCRIPTION = "This package provides a class and a bibliography style for the \
FCAV-UNESP (Faculdade de Ciencias Agrarias e Veterinarias de \
Jaboticabal UNESP) brazilian university, written based on the \
institution rules for thesis publications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn38074"

RPM_NAME = "texlive-fcavtex-2026.226.1.1svn38074-59.2.noarch.rpm"
RPM_HASH = "a417a4f070e299d944728e9562dfb1321fa667e0a3f8c19249f04ab65009bb745eee4a1bceb64f60b9398d109de7b044e59f459672bb962637dabe24a8d53217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcavtex.cls \
texlive-fcavtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2cite.sty \
tex-babel.sty \
tex-chapterbib.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-incgraph.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-layout.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-mfirstuc.sty \
tex-microtype.sty \
tex-pageslts.sty \
tex-paralist.sty \
tex-ragged2e.sty \
tex-sfmath.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
