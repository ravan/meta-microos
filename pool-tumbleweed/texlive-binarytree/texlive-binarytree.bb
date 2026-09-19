SUMMARY = "Drawing binary trees using TikZ"
DESCRIPTION = "This package provides an easy but flexible way to draw binary \
trees using TikZ. A path specification and the setting of \
various options determine the style for each edge of the tree. \
There is support for the external library of TikZ which does \
not affect externalization of the rest of the TikZ figures in \
the document. There is an option to use automatic file naming: \
useful if the trees are often moved around."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn41777"

RPM_NAME = "texlive-binarytree-2026.226.1.01svn41777-61.2.noarch.rpm"
RPM_HASH = "fe86aa3543885b002da995232ebb153105399a9bbeaee5de8943272734d29911766236cdcbc95f287e3701234e2fb609bd3824111ad3962158a5425fc8dcd938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binarytree.sty \
texlive-binarytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
