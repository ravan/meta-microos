SUMMARY = "A set of sudoku-related packages"
DESCRIPTION = "The bundle provides three packages: printsudoku, which provides \
a command \\sudoku whose argument is the name of a file \
containing a puzzle specification; solvesudoku, which attempts \
to find a solution to the puzzle in the file named in the \
argument; and createsudoku, which uses the random package to \
generate a puzzle according to a bunch of parameters that the \
user sets via macros. The bundle comes with a set of \
ready-prepared puzzle files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn78101"

RPM_NAME = "texlive-sudokubundle-2026.226.1.0asvn78101-64.2.noarch.rpm"
RPM_HASH = "49a302fad8c627d9658ec6e8537268ecc763b8c120d7deb8ab1a83849be1a5c31f17bdfbefdafdca77adae510bc5daec619786e0e57f7630d1fd87d8f15a4bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-createsudoku.sty \
tex-printsudoku.sty \
tex-solvesudoku.sty \
texlive-sudokubundle"

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
