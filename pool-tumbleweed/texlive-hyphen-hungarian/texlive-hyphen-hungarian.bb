SUMMARY = "Hungarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Hungarian in T1/EC and UTF-8 \
encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-hungarian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "872ef3e47878d01433a1a1469a452ea7daf625f10b12cba8e51760872b9a2306bb96913dda687a91f842774cd2114267a872623779ef500908107fd8ffcb9236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hu.ec.tex \
tex-hyph-hu.tex \
tex-loadhyph-hu.tex \
texlive-hyphen-hungarian"

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
