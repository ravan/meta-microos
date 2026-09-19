SUMMARY = "Draw three-dimensional ribbons"
DESCRIPTION = "The package uses PStricks and pst-solides3d to draw three \
dimensional ribbons on a cylinder, torus, sphere, cone or \
paraboloid. The width of the ribbon, the number of turns, the \
colour of the outer and the inner surface of the ribbon may be \
set. In the case of circular and conical helices, one may also \
choose the number of ribbons."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-2026.226.1.2svn23464-60.4.noarch.rpm"
RPM_HASH = "3ba3364cbd517b30eef8026af6c9bebb91d470a7a3036c34ad1e12377a00c47a93831c20067f4ca7f5eee540d1e0ed72698459a602f4645a78f58fa9c2c90216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-rubans.sty \
tex-pst-rubans.tex \
texlive-pst-rubans"

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
