SUMMARY = "Draw Bagua symbols in Yijing"
DESCRIPTION = "This package provides commands for drawing symbols in Yijing (I \
Ching) or Zhouyi using TikZ. There is no need for extra special \
fonts for showing these symbols. The package relies on TikZ, \
bitset, xintexpr, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-2026.227.1.01svn64103-62.2.noarch.rpm"
RPM_HASH = "67afd5c7a9007cc39680635c5613a48dc19a329eb163c5d5104c594250167d018aa71b1a6f86a04e4605ababe9b49d85841a79fd6491b06f36885a02351fca06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-bagua.sty \
texlive-tikz-bagua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bitset.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
