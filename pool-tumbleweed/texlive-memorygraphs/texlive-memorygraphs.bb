SUMMARY = "TikZ styles to typeset graphs of program memory"
DESCRIPTION = "This package defines some TikZ styles and adds anchors to \
existing styles that ease the declaration of 'memory graphs'. \
It is intended for graphs that represent the memory of a \
computer program during its execution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-2026.226.0.0.1.1svn49631-59.2.noarch.rpm"
RPM_HASH = "cd9069d4cc2a90c948206a18da0a03673faffef87bafd9b1c389c9047b06b10eea05d947f26a4f774e6c154eb9c275d347ed5c3b88293e9a5efdc8a543fbd498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memorygraphs.sty \
texlive-memorygraphs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
