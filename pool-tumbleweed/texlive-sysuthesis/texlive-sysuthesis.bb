SUMMARY = "LaTeX thesis template for Sun Yat-sen University"
DESCRIPTION = "This class is intended for typesetting Sun Yat-sen University \
dissertations with LaTeX, providing support for bachelor, \
master, doctoral thesis. Compilation of this class requires \
either the XeLaTeX or the LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77646"

RPM_NAME = "texlive-sysuthesis-2026.226.1.0.0svn77646-64.2.noarch.rpm"
RPM_HASH = "770a38db2b6a5d6bb765a4404d42b8a1dcd105cf6a6c0bbaabb5f7eb8ac580260f7fa9cba7d0eeadbc228781804494aa1eb6451509cc699b365bec9b09639cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sysuthesis.cls \
tex-sysuvisual.sty \
texlive-sysuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-emptypage.sty \
tex-gbt7714.sty \
tex-hyperref.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
