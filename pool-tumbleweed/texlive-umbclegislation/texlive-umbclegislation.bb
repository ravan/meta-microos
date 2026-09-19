SUMMARY = "A LaTeX class for building legislation files for UMBC Student Government Association Bills"
DESCRIPTION = "LaTeX class for building legislation files for UMBC Student \
Government Association Bills. Requires pdflatex and the \
mdframed enumitem, lineno, and xifthen packages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-2026.226.2016_6_8svn41348-60.2.noarch.rpm"
RPM_HASH = "234c8767f59206d7efd4d12bea0228774984924d6784e232acc144b8040ba2b790ad66ebac12985ccb54b6aba996f07c2ad2af55e18a22e5360a8dc22c1d1848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-legislation.cls \
texlive-umbclegislation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-lineno.sty \
tex-mdframed.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
