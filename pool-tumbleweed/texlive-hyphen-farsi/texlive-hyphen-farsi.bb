SUMMARY = "(No) Persian hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Persian."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74115"

RPM_NAME = "texlive-hyphen-farsi-2026.226.svn74115-60.2.noarch.rpm"
RPM_HASH = "3572645aba769a82b5349a6ec703b8f02257d39208f378f0c58897df41520ad90c37bfad747f5d818791d30ac624c23cb1c1000d3dc036b21d4ad54f1eb32862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fa.tex \
texlive-hyphen-farsi"

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
