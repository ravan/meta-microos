SUMMARY = "Slovak hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovak in T1/EC and UTF-8 encodings. \
Original patterns 'skhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-slovak-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "3137b9cd7f50442ddbf00e7d8f7b0f17655efadd751bd232d2311bbee061ab029fc66f69c392dcdfe23034d26c79243a7f1b96b1a330da586b42a5435767ae5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sk.ec.tex \
tex-hyph-sk.tex \
tex-loadhyph-sk.tex \
texlive-hyphen-slovak"

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
