SUMMARY = "Typeset sequences with justification pointers"
DESCRIPTION = "This package lets you typeset justified sequences, also called \
pointing strings. It's used for instance, in research papers \
about Game Semantics to represent sequence of game moves with \
their associated justification pointers. Depending on wether \
using LaTeX or pdfLaTeX, the package uses PSTricks and pst-node \
respectively pgf/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn42857"

RPM_NAME = "texlive-pstring-2026.226.svn42857-60.4.noarch.rpm"
RPM_HASH = "f3bd7fa73bdb84f7d852b03f2c33875585beb26f773c2f1e261abf11d8584f8be591fc5c5cc4f2f294bd0a8dbd94ce46218f0ab90701bf9d9adac0b54e4e1e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstring.sty \
texlive-pstring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-pgfcore.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
