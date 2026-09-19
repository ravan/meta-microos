SUMMARY = "Draw a variations table of functions and a convexity table of its graph"
DESCRIPTION = "Draw a variations table of functions and a convexity table of \
its graph This version offers two environments, to draw a \
variations table of a function and a convexity table of its \
graph."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-table-fct-2026.226.1.1svn76924-64.2.noarch.rpm"
RPM_HASH = "178dbf0586413f7ec66370f3d4295ec41ee01e3203d06068dc67965d207648768f7bd98a49e9732c9fc310c096cf68e8ec91bc6e035c021f921a822ef9bdd011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-table-fct.sty \
texlive-table-fct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
