SUMMARY = "Easy plots from Matlab in LaTeX"
DESCRIPTION = "Existing approaches to create EPS files from Matlab (laprint, \
mma2ltx, print -eps, etc.) aren't satisfactory; makeplot aims \
to resolve this problem. Makeplot is a LaTeX package that uses \
the pstricks pst-plot functions to plot data that it takes from \
Matlab output files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-2026.226.1.0.6svn15878-59.2.noarch.rpm"
RPM_HASH = "ab0f0372d9af2a719a946a82d60484add4c48812ebad80310940f8821892f0f38ba051345e3928ddfbd17d8ac316fb609b9cd8da6c4ea24ebe98fd296d091594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeplot.sty \
texlive-makeplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-pst-plot.sty \
tex-pstricks-add.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
