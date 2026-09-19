SUMMARY = "Provide an environment to draw a hexgame-board"
DESCRIPTION = "Hex is a mathematical game invented by the Danish mathematician \
Piet Hein and independently by the mathematician John Nash. \
This package defines an environment that enables the user to \
draw such a game in a trivial way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hexgame-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "b01d29e408c52cc029ffe6bce484eb0aa2b1c779452bdab091e76e2818614d88c86d606cf7b440ae225abe1c05a8dc4b38b3098207e4bfd96175eabb21eabf22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hexgame.sty \
texlive-hexgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pst-poly.sty \
tex-pstcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
