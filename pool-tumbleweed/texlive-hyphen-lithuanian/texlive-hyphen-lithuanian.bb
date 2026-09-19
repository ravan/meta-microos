SUMMARY = "Lithuanian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Lithuanian in L7X and UTF-8 encodings. \
\\lefthyphenmin and \\righthyphenmin have to be at least 2."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-lithuanian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "17e4114e27404a6f708d79a34de3c74154f3939f5e159e254a814df234f9154c158df66fa8b70de8868ec8c18bafedd6eabb19bb6cbf003449b57b71526cc9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lt.l7x.tex \
tex-hyph-lt.tex \
tex-loadhyph-lt.tex \
texlive-hyphen-lithuanian"

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
