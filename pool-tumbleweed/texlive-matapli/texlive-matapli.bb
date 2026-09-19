SUMMARY = "Class for the french journal 'MATAPLI'"
DESCRIPTION = "This is a class for the french journal 'MATAPLI' of the Societe \
de Mathematiques Appliquees et Industrielles (SMAI)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76924"

RPM_NAME = "texlive-matapli-2026.226.1.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "f676b6bb6b448c9b3da198541ed0e143e66b09645b1d3b6aa6937a99bceb7a44182c87528116664720d6154d7c1d2cd4a547078caa60128b22ff9aa7d7b4be99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matapli.cls \
texlive-matapli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bclogo.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-etoc.sty \
tex-eurosym.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-lettrine.sty \
tex-libertine.sty \
tex-libertinus-otf.sty \
tex-marvosym.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
