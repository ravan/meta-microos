SUMMARY = "Typeset Othello (Reversi) diagrams of any size, with annotations"
DESCRIPTION = "The package enables the user to generate high-quality Othello \
(also known as Reversi) board diagrams of any size. The \
diagrams support annotations, including full game transcripts. \
Automated board or transcript creation, from plain text formats \
standard to WZebra (and other programs) is also supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn23714"

RPM_NAME = "texlive-othelloboard-2026.226.1.2svn23714-61.2.noarch.rpm"
RPM_HASH = "9d815841db0bb64c6553065bf090b9c35738b120ce18a30fefda5708d56d12c9097c0f7ac2a6adfbd01adf8d0658edaeea41c2b6eac2bfa3dcf85a0066590f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-othelloboard.sty \
texlive-othelloboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pict2e.sty \
tex-stringstrings.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
