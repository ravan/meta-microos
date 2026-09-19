SUMMARY = "Draw 3-dimensional framed boxes using PSTricks"
DESCRIPTION = "A package using PSTricks to draw three dimensional framed boxes \
using a macro \\PstFrameBoxThreeD. The macro is especially \
useful for drawing 3d-seeming buttons."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-2026.226.1.10svn15878-59.2.noarch.rpm"
RPM_HASH = "5dc3c8a187207b86681edb6e760b775e208b7d4a6cc0ede5248e96e347170915eae7564ec21dfde3b4b250ad59c1889a64ba61a0abd088e256d0fc35495e6bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fr3d.sty \
tex-pst-fr3d.tex \
texlive-pst-fr3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
