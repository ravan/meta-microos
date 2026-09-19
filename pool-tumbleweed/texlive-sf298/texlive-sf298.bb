SUMMARY = "Standard form 298"
DESCRIPTION = "A LaTeX package for generating a completed standard form 298 \
(Rev. 8-98) as prescribed by ANSI Std. Z39.18 for report \
documentation as part of a document delivered, for instance, on \
a U.S. government contract."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn41653"

RPM_NAME = "texlive-sf298-2026.226.1.3svn41653-60.2.noarch.rpm"
RPM_HASH = "00561a5f3b3efcb904162c264b8b80b3c5b3847364dbafa7c97682d59c5bccf2c74d14692a14142baacbb9f75febb1a29d25101057c6ce197b52f85ebf6451b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sf298.sty \
texlive-sf298"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-multicol.sty \
tex-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
