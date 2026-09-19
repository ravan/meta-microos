SUMMARY = "LuaTeX with just-in-time (jit) compiler, with and without HarfBuzz"
DESCRIPTION = "The luajittex package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-luajittex-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "047803ea46b456bcd8a12a0915385c5135eaa9773d52a555909ae24e8ffd297d1032c26fb8aaea09983e913296fbb06a9df55317a50ccb19f808b642e105a1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luajithbtex.1 \
man-luajittex.1 \
texlive-luajittex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luajittex-bin \
texlive-luatex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
