SUMMARY = "Easily typeset Control Block Diagrams and Signal Flow Graphs"
DESCRIPTION = "Kblocks defines a number of commands to make drawing control \
block diagrams using TikZ/PGF more structured and easier. It \
reduces the learning curve forTikZ/PGF and serves as a \
frontend, by focusing on the block resp. flow diagrams only."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57617"

RPM_NAME = "texlive-kblocks-2026.226.2.0svn57617-63.2.noarch.rpm"
RPM_HASH = "de4c1d645f19189220fb3c376e708d6f007241400a32e5856f8d434f3b90e19b3895ad323dc938072fc8bde533af415709d416334780e3b6f4e708c751996c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kblocks.sty \
texlive-kblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-circuitikz.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
