SUMMARY = "Estonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Estonian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-estonian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "6f5f44bad9be1cc2913e367a45e443da74f30f7f50a414dbeecd1a1ad6275fb70b6fd38f562ef333f78fee86212e7059ecff4e0231e2f6aefd7f68eb3f5ee3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-et.ec.tex \
tex-hyph-et.tex \
tex-loadhyph-et.tex \
texlive-hyphen-estonian"

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
