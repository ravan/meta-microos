SUMMARY = "Macros to insert playing cards"
DESCRIPTION = "This package provides macros to insert playing cards, single, \
or hand, or random-hand, Poker or French Tarot or Uno, from png \
files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn76966"

RPM_NAME = "texlive-jeuxcartes-2026.226.0.0.3.5svn76966-63.2.noarch.rpm"
RPM_HASH = "472351f1543f01bf125e1b965bd3438aca19de94c37cf2b137197c9f88febcf2d44cf4a3476d485f535fea2a1580decd425df0218e483cec944df9a288414e6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-JeuxCartes.sty \
texlive-jeuxcartes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-listofitems.sty \
tex-pgffor.sty \
tex-pifont.sty \
tex-randomlist.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xinttools.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
