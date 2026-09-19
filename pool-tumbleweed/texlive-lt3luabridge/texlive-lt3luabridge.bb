SUMMARY = "Execute Lua code in any TeX engine that exposes the shell"
DESCRIPTION = "This is an expl3(-generic) package for plain TeX, LaTeX, and \
ConTeXt that allows you to execute Lua code in LuaTeX or any \
other TeX engine that exposes the shell."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.2svn76924"

RPM_NAME = "texlive-lt3luabridge-2026.226.2.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "c70418dd13d2ac87546058ff27d9a49b0865cc2caf14648e0cf107503dc5e238f7fe5c06fbc8650c1a0294e41bf04ab40a0d7c1cefd28a92f7a7952be8a22ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3luabridge.sty \
tex-lt3luabridge.tex \
tex-t-lt3luabridge.tex \
texlive-lt3luabridge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
