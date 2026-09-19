SUMMARY = "Typeset drama using LaTeX"
DESCRIPTION = "A class and style file that supports the typesetting of plays, \
including options for line numbering."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-play-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "467eafbe3ace831b3836fabd1aede3aebf811e4ca5dfcb4afaf6e9d70facc4903b947da7e70b1e95f3f81b3a1c8e5c7d15513ffdf40f442bfb908141bc50c3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-play.cls \
tex-play.sty \
texlive-play"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
