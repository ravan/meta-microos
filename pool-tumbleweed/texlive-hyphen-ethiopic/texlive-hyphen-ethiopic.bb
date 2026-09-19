SUMMARY = "Hyphenation patterns for Ethiopic scripts"
DESCRIPTION = "Hyphenation patterns for languages written using the Ethiopic \
script for Unicode engines. They are not supposed to be \
linguistically relevant in all cases and should, for proper \
typography, be replaced by files tailored to individual \
languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-ethiopic-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "9db715843698d3520d28d4c4db1706af5faaf6455af7302e9448c6676d03705e82dc54a1936cc1c0f0d2d3ed78679ae520b08aeac4f24eea6e98c26a44cb193b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mul-ethi.tex \
tex-loadhyph-mul-ethi.tex \
texlive-hyphen-ethiopic"

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
