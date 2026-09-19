SUMMARY = "Draw perspective views using PSTricks"
DESCRIPTION = "The package provides the means to draw an orthogonal parallel \
projection with an arbitrarily chosen angle and a variable \
shortening factor."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-2026.226.1.05svn39585-60.4.noarch.rpm"
RPM_HASH = "a3c3765cb9e0a0214afed9546a954c563de3eb5cb62d9b84bb3ef750d3e18e04a04a1074b2f4da104127a887c520aef8965e0c1c4289c36f445f70310d9aea1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-perspective.sty \
tex-pst-perspective.tex \
texlive-pst-perspective"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-grad.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
