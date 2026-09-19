SUMMARY = "Draw labyrinths and solution paths"
DESCRIPTION = "The labyrinth package provides code and an environment for \
typesetting simple labyrinths with LaTeX, and generating an \
automatic or manual solution path."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn33454"

RPM_NAME = "texlive-labyrinth-2026.226.1.0svn33454-63.2.noarch.rpm"
RPM_HASH = "e5b5d6a54491d76dd1e224d452b818f46a49bfcd922f7ea431c7f5004d583ce510dfb885bec648705b7fed185125c5fe92e7b9614bf2dfda53fbf950f9f81008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labyrinth.sty \
texlive-labyrinth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-picture.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
