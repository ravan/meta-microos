SUMMARY = "Typeset a three-dimensional product box"
DESCRIPTION = "The package enables typesetting of a three-dimensional product \
box. This product box can be rendered as it is standing on a \
surface and some light is shed onto it. Alternatively it can be \
typeset as a wireframe to be cut out and glued together. This \
will lead to a physical product box. The package requires pgf \
and TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn20886"

RPM_NAME = "texlive-productbox-2026.226.1.1svn20886-59.2.noarch.rpm"
RPM_HASH = "a7a5dbed0e4c702d3033a1a28242f6dd34bdd1d061554aa61e0942e883a4de9e578a318d033ad429d5082d471e5a0bb967006f073122003200843b253c69e1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-productbox.sty \
texlive-productbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
