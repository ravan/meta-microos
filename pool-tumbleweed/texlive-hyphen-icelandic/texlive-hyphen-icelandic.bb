SUMMARY = "Icelandic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Icelandic in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-icelandic-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "4cafd3a0a09c929cfab339df4954e7e71e5d990d2514e050faed7a41b18be1934508ec8911f17f057ca0bdb4ab109e31421cf7785ffbd62b22dc120e38306fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-is.ec.tex \
tex-hyph-is.tex \
tex-loadhyph-is.tex \
texlive-hyphen-icelandic"

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
