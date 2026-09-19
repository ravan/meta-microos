SUMMARY = "Draw cubic Bspline curves and interpolations"
DESCRIPTION = "The package draws uniform, cubic B-spline curves, open and \
closed, based on a sequence of B-spline control points. There \
is also code which permits drawing the open or closed cubic \
Bspline curve interpolating a sequence of points. Graphical \
output is created using PStricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-2026.226.1.62svn40685-59.2.noarch.rpm"
RPM_HASH = "730d1ccddf485cb19498a398fda022af290f756a16405743eae0157cfb08d1a8cdef7044e8ff79085f9282a4d3eae936e29b87fb72ba0d5044e04578fe3e4288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bspline.sty \
tex-pst-bspline.tex \
texlive-pst-bspline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
