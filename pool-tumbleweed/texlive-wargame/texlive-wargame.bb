SUMMARY = "A LaTeX package to prepare hex'n'counter wargames"
DESCRIPTION = "This package can help make classic Hex'n'Counter wargames using \
LaTeX. The package provides tools for generating Hex maps and \
boards Counters for units, markers, and so on Counter sheets \
Order of Battle charts Illustrations in the rules using the \
defined maps and counters The result will often be a PDF (or \
set of PDFs) that contains everything one will need for a game \
(rules, charts, boards, counter sheets). The package uses NATO \
App6 symbology for units. The package uses NATO App6 symbology \
for units. The package uses TikZ for most things. The package \
supports exporting the game to a VASSAL module See also the \
README.md file for more, and of course the documentation \
(including the tutorial in tutorial/game.pdf)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn72903"

RPM_NAME = "texlive-wargame-2026.226.0.0.8svn72903-60.2.noarch.rpm"
RPM_HASH = "87297f8fa36bc9324ab84dca37d12edb14ed478de6eee986de6a7356aede679e54a05188b742c85a5c8691e5bd59dab1a17e28b46dbc152bb8c80ce4250124de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarywargame.chit.code.tex \
tex-tikzlibrarywargame.hex.code.tex \
tex-tikzlibrarywargame.natoapp6c.code.tex \
tex-tikzlibrarywargame.util.code.tex \
tex-wargame.sty \
tex-wgexport.cls \
texlive-wargame"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standalone.cls \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
