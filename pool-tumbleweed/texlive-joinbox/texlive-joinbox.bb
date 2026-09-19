SUMMARY = "Join boxes vertically or horizontally"
DESCRIPTION = "This package can join boxes vertically or horizontally. When \
using vertical joining, all boxes to be joined will keep same \
width, while when using horizontal joined, all boxes to be \
joined keep same height."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn76924"

RPM_NAME = "texlive-joinbox-2026.226.1.0.3svn76924-63.2.noarch.rpm"
RPM_HASH = "3b02ca27095d0226fc680b5b84cd3c0017ce93dabaaf7a5f9a47960718fc2c03ca32482b4960a8e781869801c6104c31bd1d137aea24f63c293fb0d63d7a94f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-joinbox.sty \
texlive-joinbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
