SUMMARY = "Galician hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Galician in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-galician-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "379e3220e218eeaaaf2b18159b71a92c8c2cf937bf88e13de511a0ef38bbacecdb2f888ba3863d86336eaee1ddbc93e9a4fc6d61ab121ab7095d898293ef6335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-gl.ec.tex \
tex-hyph-gl.tex \
tex-loadhyph-gl.tex \
texlive-hyphen-galician"

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
