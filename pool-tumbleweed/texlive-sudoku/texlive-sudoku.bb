SUMMARY = "Create sudoku grids"
DESCRIPTION = "The sudoku package provides an environment for typesetting \
sudoku grids. A sudoku puzzle is a 9x9 grid where some of the \
squares in the grid contain numbers. The rules are simple: \
every column can only contain the digits 1 to 9, every row can \
only contain the digits 1 to 9 and every 3x3 box can only \
contain the digits 1 to 9. More information, including help and \
example puzzles, can be found at sudoku.org.uk. This site also \
has blank sudoku grids (or worksheets), but you will not need \
to print them from there if you have this package installed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-sudoku-2026.226.1.0svn78101-64.2.noarch.rpm"
RPM_HASH = "73b6af1b66d6746588e14b9896222faaace5d6bc6319e438ccbdf5293a06d79d9dc0163102b0e8bc99f01397fc42a8f9b229c0442626f9d89c52189f1b798eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sudoku.sty \
texlive-sudoku"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
