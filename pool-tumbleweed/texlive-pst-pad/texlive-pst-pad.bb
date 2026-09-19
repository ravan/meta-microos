SUMMARY = "Draw simple attachment systems with PSTricks"
DESCRIPTION = "The package collects a set of graphical elements based on \
PStricks that can be used to facilitate display of attachment \
systems such as two differently shaped surfaces with or without \
a fluid wedged in between. These macros ease the display of wet \
adhesion models and common friction systems such as boundary \
lubrication, elastohydrodynamic lubrication and hydrodynamic \
lubrication."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-2026.226.0.0.3bsvn15878-59.2.noarch.rpm"
RPM_HASH = "afce2b1fc3ce1ebc552b0848b26c1d48027510ebe4a1caae78542d0edd2d7f1cb7b62913cb3b9d5dd1dc2947b44779cb39e881e936bd62d5532b76f92a583019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pad.sty \
tex-pst-pad.tex \
texlive-pst-pad"

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
