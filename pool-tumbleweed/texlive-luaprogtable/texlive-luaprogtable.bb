SUMMARY = "Programmable table interface for LuaLaTeX"
DESCRIPTION = "This package allows you to modify a cell based on the contents \
of other cells using LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-2026.226.1.0svn56113-59.2.noarch.rpm"
RPM_HASH = "f995acb9418a4c55ed0ae9e528b60443345a33901c41babe490e7e826a7bdff57ffddba957dfd8e1cfdcd5628fa88270779450f09139e029da14412d1e3a7689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaprogtable.sty \
texlive-luaprogtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
