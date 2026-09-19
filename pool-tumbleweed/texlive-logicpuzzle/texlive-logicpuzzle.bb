SUMMARY = "Typeset (grid-based) logic puzzles"
DESCRIPTION = "The package allows the user to typeset various logic puzzles. \
At the moment the following puzzles are supported: 2D-Sudoku \
(aka Magiequadrat, Diagon, ...), Battleship (aka Bimaru, \
Marinespiel, Batalla Naval, ...), Bokkusu (aka Kakurasu, \
Feldersummenratsel, ...), Bridges (akak Bruckenbau, Hashi, \
...), Chaos Sudoku, Four Winds (aka Eminent Domain, \
Lichtstrahl, ...), Hakyuu (aka Seismic, Ripple Effect, ...), \
Hitori, Kakuro, Kendoku (aka Mathdoku, Calcudoku, Basic, \
MiniPlu, Ken Ken, Square Wisdom, Sukendo, Caldoku, ..., Killer \
Sudoku (aka Samunapure, Sum Number Place, Sumdoku, \
Gebietssummen, ...), Laser Beam (aka Laserstrahl, ...), Magic \
Labyrinth (aka Magic Spiral, Magisches Labyrinth, ...), Magnets \
(aka Magnetplatte, Magnetfeld, ...), Masyu (aka Mashi, \
{White|Black} Pearls, ...), Minesweeper (aka Minensuche, ...), \
Nonogram (aka Griddlers, Hanjie, Tsunami, Logic Art, Logimage, \
...), Number Link (aka Alphabet Link, Arukone, Buchstabenbund, \
...), Resuko, Schatzsuche, Skyline (aka Skycrapers, \
Wolkenkratzer, Hochhauser, ...), including Skyline Sudoku and \
Skyline Sudoku (N*N) variants, Slitherlink (aka Fences, Number \
Line, Dotty Dilemma, Sli-Lin, Takegaki, Great Wall of China, \
Loop the Loop, Rundweg, Gartenzaun, ...), Star Battle (aka \
Sternenschlacht, ...), Stars and Arrows (aka Sternenhimmel, \
...), Sudoku, Sun and Moon (aka Sternenhaufen, Munraito, ...), \
Tents and Trees (aka Zeltlager, Zeltplatz, Camping, ...), and \
Tunnel."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn78101"

RPM_NAME = "texlive-logicpuzzle-2026.226.2.5svn78101-61.2.noarch.rpm"
RPM_HASH = "50ef7300f4ef857e33699b984b2e7d2a9b61f9e104506ec984bae074b1b58bc629732e0984ecc4f217dd2595a0a70af04c7c920799fb88b658b4c6fb60783854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logicpuzzle.sty \
tex-lpenv.sty \
texlive-logicpuzzle"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-marginnote.sty \
tex-ragged2e.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
