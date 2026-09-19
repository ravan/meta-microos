SUMMARY = "Romansh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Romansh. All Romansh idioms and \
Rumantsch Grischun taken into account, developed in \
collaboration with Fundaziun Medias Rumantschas (Romansh news \
agency) and Lia Rumantscha (Romansh umbrella organisation)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-romansh-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "b439a2daf573ce0b4a29644671765f46afae8ed8852d272158cab0a25fc897a12602aea7dc389abad1422fcd8546100c0bac4f7a337fd44d08bce6dea1e0f520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-rm.ec.tex \
tex-hyph-rm.tex \
tex-loadhyph-rm.tex \
texlive-hyphen-romansh"

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
