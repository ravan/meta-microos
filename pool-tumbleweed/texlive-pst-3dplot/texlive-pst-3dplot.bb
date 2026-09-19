SUMMARY = "Draw 3D objects in parallel projection, using PSTricks"
DESCRIPTION = "A package using PSTricks to draw a large variety of graphs and \
plots, including 3D maths functions. Data can be read from \
external data files, making this package a generic tool for \
graphing within TeX/LaTeX, without the need for external tools."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.09svn68727"

RPM_NAME = "texlive-pst-3dplot-2026.226.2.09svn68727-59.2.noarch.rpm"
RPM_HASH = "ea17108d5dfb0259298f97526b88947154f8c4d89460ac670f1fa4ba2efec84e6dfdf1dcecedeafea0d51a9f9ed254632eaafafde3dd27009d2c3eaf0a6920b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-3dplot.sty \
tex-pst-3dplot.tex \
texlive-pst-3dplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
