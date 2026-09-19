SUMMARY = "Serbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Serbian in T1/EC, T2A and UTF-8 \
encodings. For 8-bit engines the patterns are available \
separately as 'serbian' in T1/EC encoding for Latin script and \
'serbianc' in T2A encoding for Cyrillic script. Unicode engines \
should only use 'serbian' which has patterns in both scripts \
combined."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0asvn78069"

RPM_NAME = "texlive-hyphen-serbian-2026.226.1.0asvn78069-60.2.noarch.rpm"
RPM_HASH = "2eb83ef15181f60fd7ce4210bdc0e617065c8022d8f86ad6c30cf9e6943ce4929c05382561e0c8a73329f4877d70d04e01d793e3f10a151e9436ee169b9e6c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sh-cyrl.t2a.tex \
tex-hyph-sh-cyrl.tex \
tex-hyph-sh-latn.ec.tex \
tex-hyph-sh-latn.tex \
tex-hyph-sr-cyrl.tex \
tex-loadhyph-sr-cyrl.tex \
tex-loadhyph-sr-latn.tex \
texlive-hyphen-serbian"

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
