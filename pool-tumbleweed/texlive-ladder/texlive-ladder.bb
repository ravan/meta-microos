SUMMARY = "Draw simple ladder diagrams using TikZ"
DESCRIPTION = "This package permits the creation of simple ladder diagrams \
within LaTeX documents. Required packages are tikz, ifthen, and \
calc."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44394"

RPM_NAME = "texlive-ladder-2026.226.svn44394-63.2.noarch.rpm"
RPM_HASH = "53dac150c950cd471782bcba5e1260d9fcb134a541118441027b9d34644c7ca9c596c0e8181028985efbdcf67bfac8e953f959c5eb850fc342695a4c73c9f81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ladder.sty \
texlive-ladder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
