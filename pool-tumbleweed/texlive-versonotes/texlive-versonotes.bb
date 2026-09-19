SUMMARY = "Display brief notes on verso pages"
DESCRIPTION = "This package allows you to place notes on the verso pages of an \
otherwise single-sided document. If, in the run of text, you \
include a call to the macro \\versonote{This is a remark}, then \
that text will be placed on the opposite (ie, 'verso') page, \
lined up with the macro call."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-versonotes-2026.226.0.0.5svn77682-60.2.noarch.rpm"
RPM_HASH = "4b8dd307b07d10ea285a502032414b597cd2ab2d847a95de2234c4c293f727b209cf46930085aaa615368a2124f3d59b6a8c9e312834b8b8074f0f66e1a4db44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-versonotes.sty \
texlive-versonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
