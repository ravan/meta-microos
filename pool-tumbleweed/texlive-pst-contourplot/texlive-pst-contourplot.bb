SUMMARY = "Draw implicit functions using the 'marching squares' algorithm"
DESCRIPTION = "This package allows to draw implicit functions 'f(x,y) = 0' \
with options for coloring the inside of the surfaces, for \
marking the points and arrowing the curve at points chosen by \
the user. The package uses the 'marching squares' algorithm."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-2026.226.0.0.6svn48230-59.2.noarch.rpm"
RPM_HASH = "1f89d030bdb4f6facecb8ac9e32cc18b3acf6c4e87585049391f7845d956c912af6c25365e936a31a211c2f27f61ebda1d90a47247a37c8bd419ed0fd1a5a774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-contourplot.sty \
tex-pst-contourplot.tex \
texlive-pst-contourplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
