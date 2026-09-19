SUMMARY = "LaTeX class for formatting academic papers in ABNT standards"
DESCRIPTION = "This is a LaTeX class created for Brazilian students to \
facilitate the use of standards from the Associacao Brasileira \
de Normas Tecnicas (ABNT) in academic works like TCCs, \
dissertations, theses."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.0.5_betasvn76889"

RPM_NAME = "texlive-abntexto-2026.226.4.0.5_betasvn76889-61.2.noarch.rpm"
RPM_HASH = "c910be57dd8c8f6197bcdc7ea1514719c77e735b9a48c11d771f00f832dca9452275a930f5461357eb52854f5e2997eb203106d789b0c54542636c1ea8502df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abntexto-3-2-1-beta.cls \
tex-abntexto.cls \
texlive-abntexto"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-size12.clo \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
