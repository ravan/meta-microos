SUMMARY = "Coptic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Coptic in UTF-8 encoding as well as in \
ASCII-based encoding for 8-bit engines. The latter can only be \
used with special Coptic fonts (like CBcoptic). The patterns \
are considered experimental."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-coptic-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "dfba7bfb261dfea2aba3b13b5c45b276e9dd0b7d216fdcac65e15009bf47b1d37f8908871d7c483dc6a0b65ad12c41e1417e6bfbe6a5ccc7e7306bd2dc8a169e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copthyph.tex \
tex-hyph-cop.tex \
tex-loadhyph-cop.tex \
texlive-hyphen-coptic"

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
