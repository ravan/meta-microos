SUMMARY = "Display git project information in your LaTeX projects"
DESCRIPTION = "This project aims to display git project information in PDF \
documents. It is mostly written in Lua for executing the git \
commands, thereby making this package only applicable for \
LuaLaTeX with shell escape enabled. If LuaLaTeX isn't working \
for you, you could try gitinfo2 instead. For LaTeX, a set of \
standard macros is provided for displaying basic information or \
setting the project directory, and a set of advanced macros for \
formatting commits and tags."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn72284"

RPM_NAME = "texlive-gitinfo-lua-2026.226.1.2.0svn72284-60.4.noarch.rpm"
RPM_HASH = "69fddd76e9d378339cd92f3b1e73dcadee27495ba030272f8732c99d73513fd45b987ea8df62728e4192bea0b846b12bbc8499f2f97aad62102c626971cb4f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitinfo-lua.sty \
texlive-gitinfo-lua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
