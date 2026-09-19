SUMMARY = "Spanish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Spanish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn78069"

RPM_NAME = "texlive-hyphen-spanish-2026.226.5.0svn78069-60.2.noarch.rpm"
RPM_HASH = "556f29b41b89c0a8bac2c237b93b9d103a3c8c26ba0a9b700bbbb2c07af6fabdc425c1da70846472770d8f31777ce6f07e6f18497152f4b0cae607fcaa4f9965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-es.ec.tex \
tex-hyph-es.tex \
tex-loadhyph-es.tex \
texlive-hyphen-spanish"

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
