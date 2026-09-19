SUMMARY = "Low-level mplib integration for LuaTeX"
DESCRIPTION = "This package offers low-level mplib integration for LuaLaTeX \
and plain LuaTeX. It is designed with the purpose of being easy \
to extend. The use of multiple simultaneous MetaPost instances \
is supported, as well as running TeX or lua code from within \
MetaPost. With the included minim-mp and minim-lamp format \
files, you can even use Lua(La)TeX as a stand-alone MetaPost \
compiler."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn73816"

RPM_NAME = "texlive-minim-mp-2026.226.2025_1.7svn73816-61.2.noarch.rpm"
RPM_HASH = "c0244587d5464431d59413da47becc95b42cb6236c54c7ae9c254008ac0dad992dec764426bf3079463e32f1e33f9f66e79cfe83399b4d37caae31615bcf521d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-mp.sty \
tex-minim-mp.tex \
texlive-minim-mp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
