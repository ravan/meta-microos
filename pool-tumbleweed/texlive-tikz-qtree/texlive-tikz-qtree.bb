SUMMARY = "Use existing qtree syntax for trees in TikZ"
DESCRIPTION = "The package provides a macro for drawing trees with TikZ using \
the easy syntax of Alexis Dimitriadis' Qtree. It improves on \
TikZ's standard tree-drawing facility by laying out tree nodes \
without collisions; it improves on Qtree by adding lots of \
features from TikZ (for example, edge labels, arrows between \
nodes); and it improves on pst-qtree in being usable with \
pdfTeX and XeTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-2026.226.1.2svn26108-59.2.noarch.rpm"
RPM_HASH = "53c06e41274e3b85144e10348934d4123ae25ae3c465c4ab8a752acaa7d82276f98d5c14d269231159723a9f2d1aec45cb0d43473fb0790163321f683a0e4e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfsubpic.sty \
tex-pgfsubpic.tex \
tex-pgftree.sty \
tex-pgftree.tex \
tex-tikz-qtree-compat.sty \
tex-tikz-qtree.sty \
tex-tikz-qtree.tex \
texlive-tikz-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-pgffor.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
