SUMMARY = "Ukrainian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ukrainian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ukrhyph' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-ukrainian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "1e007601b91d372e8a8e0ee1498e2e4abf60ac1c2956906d1a1cb8294ed000dd42ace5a1f2e094ba036af70dde08e8ffdadeb8d82019a2d30aeb926c49258b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-uk.tex \
tex-hyph-uk.t2a.tex \
tex-hyph-uk.tex \
tex-loadhyph-uk.tex \
texlive-hyphen-ukrainian"

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
texlive-scripts-bin \
texlive-ukrhyph"

inherit rpm
