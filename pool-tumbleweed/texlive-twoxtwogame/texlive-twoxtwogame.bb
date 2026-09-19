SUMMARY = "Visualize 2x2 normal-form games"
DESCRIPTION = "This is a package for the visualization of 2x2 normal form \
games. The package is based on PGF/TikZ and produces beautiful \
vector graphics that are intended for use in scientific \
publications. The commands include the creation of graphical \
representations of 2x2 games, the visualization of equilibria \
in 2x2 games and game embeddings for 2x2 games."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn70423"

RPM_NAME = "texlive-twoxtwogame-2026.226.0.0.2svn70423-59.2.noarch.rpm"
RPM_HASH = "a9e55ea20185645cf3b3e246fec30baabd270d913d25af6fb3d34f285b7df0496efae4dd949f7338f2c905afa72f6564b32d46f59e5c442a65d776f8c4e501c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-twoxtwogame.sty \
texlive-twoxtwogame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-pgfmath-xfp.sty \
tex-pgfplots.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-tikzscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
