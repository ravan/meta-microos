SUMMARY = "Catalan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Catalan in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-catalan-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "deead7953ac5d85fa8e741b2a2ffff5a3030d5cec6438dfc9e38dd4322acf09a71ed7d3b2078c0c40c3e590049e33d5989a489405c4e38d5b25ec66c42249a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ca.ec.tex \
tex-hyph-ca.tex \
tex-loadhyph-ca.tex \
texlive-hyphen-catalan"

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
