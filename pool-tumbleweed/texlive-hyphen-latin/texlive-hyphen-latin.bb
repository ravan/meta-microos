SUMMARY = "Latin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latin in T1/EC and UTF-8 encodings, \
mainly in modern spelling (u when u is needed and v when v is \
needed), medieval spelling with the ligatures \\ae and \\oe and \
the (uncial) lowercase 'v' written as a 'u' is also supported. \
Apparently there is no conflict between the patterns of modern \
Latin and those of medieval Latin. Hyphenation patterns for the \
Classical Latin in T1/EC and UTF-8 encodings. Classical Latin \
hyphenation patterns are different from those of 'plain' Latin, \
the latter being more adapted to modern Latin. Hyphenation \
patterns for the Liturgical Latin in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn78069"

RPM_NAME = "texlive-hyphen-latin-2026.226.3.1svn78069-60.2.noarch.rpm"
RPM_HASH = "d77636458af3c89983b70b9cbf38553e0a14046d4a44ae6027f4c9b9b0bdf94a691fa4c31976f201cc0b1ee769ea1948187e51e749b828b5045eb0070596bf9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-la-x-classic.ec.tex \
tex-hyph-la-x-classic.tex \
tex-hyph-la-x-liturgic.ec.tex \
tex-hyph-la-x-liturgic.tex \
tex-hyph-la.ec.tex \
tex-hyph-la.tex \
tex-loadhyph-la-x-classic.tex \
tex-loadhyph-la-x-liturgic.tex \
tex-loadhyph-la.tex \
texlive-hyphen-latin"

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
