SUMMARY = "A basic LuaTeX OpenType handler"
DESCRIPTION = "This is a basic LuaTeX OpenType handler, based on Paul \
Isambert's PiTeX code. It should work with Plain TeX at least."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn69080"

RPM_NAME = "texlive-blopentype-2026.226.0.0.0.4svn69080-59.2.noarch.rpm"
RPM_HASH = "a8be593ed1dceca87cffda0a9810204e34916284254c8431582bc74127ba33f85a0095907142d2e024e597a7a52696af6263a34b20376af9c2b9859da3714f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blot-files.tex \
tex-blot-fonts.tex \
tex-blot-lua.tex \
tex-blot.tex \
texlive-blopentype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gates \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texapi \
texlive-yax"

inherit rpm
