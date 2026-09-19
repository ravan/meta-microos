SUMMARY = "Typeset code with annotations"
DESCRIPTION = "The idea of this Package is to typeset illustrations of pieces \
of code with annotations on each single part of code (Code \
Anatomy). The origin of this idea are code illustrations from \
the book 'Computer Science: An Interdisciplinary Approach' from \
Robert Sedgewick and Kevin Wayne. The package depends on expl3, \
xparse, and TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5_betasvn76924"

RPM_NAME = "texlive-codeanatomy-2026.226.0.0.5_betasvn76924-60.2.noarch.rpm"
RPM_HASH = "6ac2912386059220ddfe06a408e1e835a917af19f67a8da317c38cf7e0b944c99050cce183aa645e0d006ccfc43a7c3af733e1134b42c633364bd1a514ef60cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codeanatomy.sty \
texlive-codeanatomy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
