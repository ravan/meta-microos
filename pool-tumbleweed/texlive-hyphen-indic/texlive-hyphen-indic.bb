SUMMARY = "Indic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Assamese, Bengali, Gujarati, Hindi, \
Kannada, Malayalam, Marathi, Oriya, Panjabi, Tamil and Telugu \
for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-indic-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "1eeb414bf4f93adc36d37b0b0241c067c9cebb4263193e268e39dc9a873f7220aba6175dbb15c8885f121036662e3bec8c7ce5fc8eb5cb69d4cf4348ae7aceba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-as.tex \
tex-hyph-bn.tex \
tex-hyph-gu.tex \
tex-hyph-hi.tex \
tex-hyph-kn.tex \
tex-hyph-ml.tex \
tex-hyph-mr.tex \
tex-hyph-or.tex \
tex-hyph-pa.tex \
tex-hyph-pi.tex \
tex-hyph-ta.tex \
tex-hyph-te.tex \
tex-loadhyph-as.tex \
tex-loadhyph-bn.tex \
tex-loadhyph-gu.tex \
tex-loadhyph-hi.tex \
tex-loadhyph-kn.tex \
tex-loadhyph-ml.tex \
tex-loadhyph-mr.tex \
tex-loadhyph-or.tex \
tex-loadhyph-pa.tex \
tex-loadhyph-pi.tex \
tex-loadhyph-ta.tex \
tex-loadhyph-te.tex \
texlive-hyphen-indic"

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
