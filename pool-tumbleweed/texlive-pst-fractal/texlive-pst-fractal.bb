SUMMARY = "Draw fractal sets using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw the Julia and Mandelbrot \
sets, the Sierpinski triangle, Koch flake, and Apollonius \
Circle as well as fractal trees (which need not be balanced) \
with a variety of different parameters (including varying \
numbers of iterations). The package uses the pst-xkey package, \
part of the xkeyval distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-2026.226.0.0.12svn64714-59.2.noarch.rpm"
RPM_HASH = "aba897dd3966c95945aa38180652962579c57edc10143d90054be3e78822f390ffe3b1e7e5c7a6b3d6d764f0772f8492efa8bd84de8b1dc1ebfe0021f5724b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fractal.sty \
tex-pst-fractal.tex \
texlive-pst-fractal"

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
