SUMMARY = "Create and customise Sudoku grids of various sizes"
DESCRIPTION = "This package provides tools for typesetting Sudoku grids of \
various sizes in LaTeX. Unlike other Sudoku packages which are \
typically limited to the standard 9x9 layout, this package \
supports a broad range of grid sizes - from trivial 1x1 puzzles \
to extended 49x49 Sudokus - that's the limit for now! Grids are \
drawn with our sudoku environment, which is based on using \
LaTeX's native tabular environment. We include intuitive \
options to control dimensions, font size, and grid thickness. \
Entries in the grid are inserted as in a regular table, thus \
making it simple to create, customise, and fill Sudoku puzzles \
manually."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn78101"

RPM_NAME = "texlive-multi-sudoku-2026.226.1.00svn78101-61.2.noarch.rpm"
RPM_HASH = "6b3572e18985c65a52bd0a8955f1991941415184d93935b9baba28b7f46ab05281b37bdcd65bb4a279285392fbb4a9304a553008d262dc30534d40686707fafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multi-sudoku.sty \
texlive-multi-sudoku"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
