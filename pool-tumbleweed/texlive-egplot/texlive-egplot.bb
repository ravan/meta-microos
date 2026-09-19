SUMMARY = "Encapsulate Gnuplot sources in LaTeX documents"
DESCRIPTION = "A package to encapsulate gnuplot commands in a LaTeX source \
file, so that a document's figures are maintained in parallel \
with the document source itself."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.02asvn20617"

RPM_NAME = "texlive-egplot-2026.226.1.02asvn20617-61.4.noarch.rpm"
RPM_HASH = "46abcb6751be635c7ed5ca4c92c2cd39cdbb1a8936fad5369df69dde2366e740071e89376ea27fb16932c1a0644fa094700e04241f0dae421a0e7ec7e2b67875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egplot.sty \
texlive-egplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
