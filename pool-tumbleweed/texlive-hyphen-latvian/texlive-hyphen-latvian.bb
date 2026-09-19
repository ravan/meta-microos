SUMMARY = "Latvian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latvian in L7X and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-latvian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "75efc0ff260242c70fc8d08a2b42c946e900279a2470b2291def38703946f163102d006d1b3e31908456cfbdf12095094bb5a91b7eedf1911f9857c1dfc7f1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lv.l7x.tex \
tex-hyph-lv.tex \
tex-loadhyph-lv.tex \
texlive-hyphen-latvian"

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
