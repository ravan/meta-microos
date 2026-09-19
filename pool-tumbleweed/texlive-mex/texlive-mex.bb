SUMMARY = "Polish formats for TeX"
DESCRIPTION = "MeX is an adaptation of Plain TeX (MeX) and LaTeX209 (LaMeX) \
formats to the Polish language and to Polish printing customs. \
It contains a complete set of Metafont sources of Polish fonts, \
hyphenation rules for the Polish language and sources of \
formats."
LICENSE = "SUSE-TeX"

PV = "2026.226.1.05asvn58661"

RPM_NAME = "texlive-mex-2026.226.1.05asvn58661-61.2.noarch.rpm"
RPM_HASH = "7bbabd6ccb2d1d3cc183e6cd177081e53a0c138e309b7f39f0c45bb5185b620c020b0b2867bb1dc11a16ed2f7ea67ddec8cc4479b700e2ac3ddb4dd897526eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mex \
tex-lamex.tex \
tex-mex.tex \
tex-mex1.tex \
tex-mex2.tex \
tex-mexconf.tex \
texlive-mex"

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
texlive-enctex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-hyphen-polish \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mex-bin \
texlive-pdftex \
texlive-pl \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files \
texlive-utf8mex"

inherit rpm
