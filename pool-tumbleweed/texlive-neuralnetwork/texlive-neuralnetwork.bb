SUMMARY = "Graph-drawing for neural networks"
DESCRIPTION = "The package provides facilities for graph-drawing, with \
facilities designed for neural network diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-2026.226.1.0svn31500-61.2.noarch.rpm"
RPM_HASH = "90a5e4c683ceb8e2078282b01f674baaaca0c18392d8b3f3613d4d0f2ac398e67104fbf0886aa36cd3d503b9d409d9b9e9758e26c1af27c215b8286e383d3f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-neuralnetwork.sty \
texlive-neuralnetwork"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
