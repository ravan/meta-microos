SUMMARY = "Sanskrit hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Sanskrit and Prakrit in \
transliteration, and in Devanagari, Bengali, Kannada, Malayalam \
and Telugu scripts for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-sanskrit-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "255c9a30492a4018e25b3afa5cba6daaa2bb021d04f53c7ff1d875091a4107634e00149185259d07bcd182388696a3be579bf897f4038dea64b4c1fb1ba1f6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sa.tex \
tex-loadhyph-sa.tex \
texlive-hyphen-sanskrit"

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
