SUMMARY = "Draw Bao diagrams"
DESCRIPTION = "The package draws Bao diagrams in LaTeX. The package is a \
development of psgo, and uses PSTricks to draw the diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55013"

RPM_NAME = "texlive-psbao-2026.226.1.0svn55013-59.2.noarch.rpm"
RPM_HASH = "7a7c86d0460d5b32c671c446505f2bc1dfc0253140e862125837fa3ede9caf1fdee206a05330469df76b77e5bb4ca5b603db55c045e845c2442f090df985f9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psbao.sty \
texlive-psbao"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-cool.sty \
tex-etex.sty \
tex-ifthen.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
