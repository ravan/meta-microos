SUMMARY = "Sudokus for ConTeXt"
DESCRIPTION = "A port of Peter Norvig's sudoku solver to Lua/ConTeXt. It \
provides four basic commands for typesetting sudokus, as well \
as a command handler."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77880"

RPM_NAME = "texlive-context-sudoku-2026.226.svn77880-61.2.noarch.rpm"
RPM_HASH = "5af50df1d7ae56b27aa9dc2d6f8a18cf086e70c55869803a9a5fd5c2c7f113ac5baf9c68c6cbcea66c7e5a8a020913e1b8b95187e838a844ec6c6990bb726577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-sudoku"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
