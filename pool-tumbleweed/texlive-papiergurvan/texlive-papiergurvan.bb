SUMMARY = "Commands to work with Gurvan Paper"
DESCRIPTION = "This package provides commands to display Gurvan grids or \
Gurvan full pages, and also the possibility to write on lines. \
The source for the design of the paper can be found at \
http://www.sos-ecriture.fr/2014/10/papier-gurvan.html."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73069"

RPM_NAME = "texlive-papiergurvan-2026.226.0.0.1.0svn73069-58.2.noarch.rpm"
RPM_HASH = "e369e6f804c5efc9a3454fdf92d31025879fba045e7abad365100964e3549ed704373029f77f575f1ceec2f4e2ff69b95574af9a6aa1b5a9ff155323bd76df77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PapierGurvan.sty \
texlive-papiergurvan"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-setspace.sty \
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
