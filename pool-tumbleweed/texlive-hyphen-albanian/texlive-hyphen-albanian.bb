SUMMARY = "Albanian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Albanian in UTF-8 and T1 encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-albanian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "a0715bdaac43c9083c8492a20942b0eb369bd32b5dba966b360e5011ec78f117b98a5bea7523016b5291ece55e08b523a17c73a456816574491f246f01735253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-sq.tex \
tex-hyph-sq.ec.tex \
tex-hyph-sq.tex \
tex-loadhyph-sq.tex \
texlive-hyphen-albanian"

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
