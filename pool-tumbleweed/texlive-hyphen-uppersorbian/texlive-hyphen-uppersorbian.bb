SUMMARY = "Upper Sorbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Upper Sorbian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-uppersorbian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "1aa71f6823d4162b9b5e324d7fd1d8b5f9ea3b9f1035367dc601ea50aed7c94405337704103f07614117316970f8028862e4296e52e084313462ea4c3ab67716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hsb.ec.tex \
tex-hyph-hsb.tex \
tex-loadhyph-hsb.tex \
texlive-hyphen-uppersorbian"

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
