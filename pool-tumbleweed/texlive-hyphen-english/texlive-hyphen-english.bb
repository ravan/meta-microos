SUMMARY = "English hyphenation patterns"
DESCRIPTION = "Additional hyphenation patterns for American and British \
English in ASCII encoding. The American English patterns \
(usenglishmax) greatly extend the standard patterns from Knuth \
to find many additional hyphenation points. British English \
hyphenation is completely different from US English, so has its \
own set of patterns."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-english-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "1a2686e76c5d9debe748839939a8fb992c04f4e8740c36ac7abeb2d1e381a14ad1a2b85fbbf5f02b5ab16fe88f9b1c96badfc2fa6640da118697ec9037c6ac98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-en-gb.tex \
tex-hyph-en-us.tex \
tex-loadhyph-en-gb.tex \
tex-loadhyph-en-us.tex \
texlive-hyphen-english"

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
