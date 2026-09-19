SUMMARY = "Macedonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Macedonian"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-macedonian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "629d8620e63920e402efbe16d49d5008a311b2013825e58958c1fdaae74da033721d53b20201c5e22d97239e9775c538e2df2b61f235b25aa4fe8ee45894d67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mk.macedonian.tex \
tex-hyph-mk.tex \
tex-loadhyph-mk.tex \
texlive-hyphen-macedonian"

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
