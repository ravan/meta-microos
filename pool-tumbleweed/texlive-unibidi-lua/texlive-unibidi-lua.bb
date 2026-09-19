SUMMARY = "Unicode bidi algorithm implementation for various LuaTeX formats"
DESCRIPTION = "The package adopts the unicode bidi algorithm implementation \
provided in ConTeXt, and adapts it to be used in OpTeX, LaTeX \
and Plain TeX . It works under LuaTeX only."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn77352"

RPM_NAME = "texlive-unibidi-lua-2026.226.0.0.3svn77352-60.2.noarch.rpm"
RPM_HASH = "ac6083c4a327da215906fcbb12fac3a296ba86e4a1667e92882f8a427a512d6af78a25f8e84d039304f1b0d54df9b3ddbbfd4741347cd0f7c01650c7a313b209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unibidi-lua.sty \
tex-unibidi-lua.tex \
texlive-unibidi-lua"

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
