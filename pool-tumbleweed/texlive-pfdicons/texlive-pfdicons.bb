SUMMARY = "Draw process flow diagrams in chemical engineering"
DESCRIPTION = "This package provides TikZ shapes to represent commonly \
encountered unit operations for depiction in process flow \
diagrams (PFDs) and, to a lesser extent, process and \
instrumentation diagrams (PIDs). The package was designed with \
undergraduate chemical engineering students and faculty in \
mind, and the number of units provided should cover--in \
Turton's estimate--about 90 percent of all fluid processing \
operations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77771"

RPM_NAME = "texlive-pfdicons-2026.226.1.1svn77771-58.2.noarch.rpm"
RPM_HASH = "7d04da7f6c5718c29633dcbc7cf9c1dea04d87e753646b1c411872023cccb49702b013b8cd33b45a066b5be29d979f10dc1c67909d5db7d1c8e4c0e4058ab6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pfdicons.sty \
texlive-pfdicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
