SUMMARY = "(No) Arabic hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Arabic."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74115"

RPM_NAME = "texlive-hyphen-arabic-2026.226.svn74115-60.2.noarch.rpm"
RPM_HASH = "cd266580056aa5dd225b1592eb343cdddedd0aeb433a801c6cdd2cda5204cec60975549a9f1c352cfc47fbb08055d5c5f5c99570d2df11c64a15baed9ac341a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ar.tex \
texlive-hyphen-arabic"

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
