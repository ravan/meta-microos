SUMMARY = "Print a coloured contour around text"
DESCRIPTION = "This package generates a coloured contour around a given text \
in order to enable printing text over a background without the \
need of a coloured box around the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn77682"

RPM_NAME = "texlive-contour-2026.226.2.14svn77682-61.2.noarch.rpm"
RPM_HASH = "cc647b0d3eea885645742cd28ea640972778b877e3f128447852e48747596b73e768b6a766639bd0a5533c032110398f4e0ab887fb6e78825c4a8a28d4ec90de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-contour.cfg \
tex-contour.sty \
texlive-contour"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
