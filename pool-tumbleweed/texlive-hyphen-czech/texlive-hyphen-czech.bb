SUMMARY = "Czech hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Czech in T1/EC and UTF-8 encodings. \
Original patterns 'czhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-czech-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "520907f0257a15a579b7da47fcf6aa1e8600b3ba1d51336f35cd15e7a74f3308ac0df15860515635d1aa689165e9203cc95c75e581023876295e9565db0aad0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cs.ec.tex \
tex-hyph-cs.tex \
tex-loadhyph-cs.tex \
texlive-hyphen-czech"

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
