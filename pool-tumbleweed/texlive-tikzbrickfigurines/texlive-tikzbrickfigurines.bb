SUMMARY = "Draw brick figurines with TikZ"
DESCRIPTION = "A small LaTeX package to draw (2D) brick-figurines with TikZ. \
The user can modify colors and/or elements."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76088"

RPM_NAME = "texlive-tikzbrickfigurines-2026.226.0.0.1.1svn76088-59.2.noarch.rpm"
RPM_HASH = "98a1007d427a3e200e325aa7cdb966df8702af129257a8c938b5cb3363fa9fc4a797b864915b1f4ca2ad7373b3e0a57660d9e21de73722e7a9469a46c1cdede5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzbrickfigurines.sty \
texlive-tikzbrickfigurines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
