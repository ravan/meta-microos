SUMMARY = "LuaTeX with HarfBuzz library for glyph shaping"
DESCRIPTION = "The luahbtex package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-luahbtex-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "3b61d867960ac3fb2e3df017f595fa24c3744c522a657f3dfbd1397c57152c7ef436cd6a0c834e2331376d1937d7709d1ba763c4d64747a4333c0a634b2eae57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luahbtex.1 \
texlive-luahbtex"

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
texlive-luahbtex-bin \
texlive-luatex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
