SUMMARY = "Support of signal processing-related disciplines"
DESCRIPTION = "The package offers a collection of useful macros for \
disciplines related to signal processing. It defines macros for \
plotting a sequence of numbers, drawing the pole-zero diagram \
of a system, shading the region of convergence, creating an \
adder or a multiplier node, placing a framed node at a given \
coordinate, creating an up-sampler or a down-sampler node, \
drawing the block diagram of a system, drawing adaptive \
systems, sequentially connecting a list of nodes, and \
connecting a list of nodes using any node-connecting macro."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-2026.226.1.4svn21667-60.4.noarch.rpm"
RPM_HASH = "f5315fb3f637da1198df8d95284cffaf29e6272e6a835236072fc63bd3aa7905edc9d143a1aef24878f8f42c7cbabcc0bcfc6e742d0debb929d8bb5d4490de1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-sigsys.sty \
tex-pst-sigsys.tex \
texlive-pst-sigsys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
