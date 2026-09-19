SUMMARY = "Dutch hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Dutch in T1/EC and UTF-8 encodings. \
These patterns don't handle cases like 'menuutje' > 'menu-tje', \
and don't hyphenate words that have different hyphenations \
according to their meaning."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn78069"

RPM_NAME = "texlive-hyphen-dutch-2026.226.1.1svn78069-60.2.noarch.rpm"
RPM_HASH = "85e0761df2d99c4311ed5d6564741fbe6dabd7128c3dfebdee068e7a680284e675756f461467bf85a1f5cab58405712b4e120b71497280cd9c9824afa7a6f7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-nl.ec.tex \
tex-hyph-nl.tex \
tex-loadhyph-nl.tex \
texlive-hyphen-dutch"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
