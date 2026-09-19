SUMMARY = "Draw quantum circuit diagrams"
DESCRIPTION = "The purpose of this package is to extend TikZ with the \
functionality for drawing quantum circuit diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67206"

RPM_NAME = "texlive-quantikz-2026.226.1.0.1svn67206-60.4.noarch.rpm"
RPM_HASH = "204b7af9cb749250d93b0de07cbf11fda5694d3de6e0993929c723a79ca709f8e7a14aac1843afcd492e86b31fbe58b8e9eee2b82710ccca2fe0bf2866ab106e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantikz.sty \
tex-tikzlibraryquantikz.code.tex \
tex-tikzlibraryquantikz2.code.tex \
texlive-quantikz"

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
