SUMMARY = "Draw Bezier curves"
DESCRIPTION = "The package provides a macro \\psbcurve for drawing a Bezier \
curve. Provision is made for full control of over all the \
control points of the curve."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-2026.226.0.0.03svn41981-59.2.noarch.rpm"
RPM_HASH = "07553b1cf51fefe75e8ee5ccd53bed510ae6aa7c5e1a6f810c132a16513ee78a36e6c27f0bb800b544c8e616cb44f2cadcfa9dea4c76e38252987be8fe81114e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bezier.sty \
tex-pst-bezier.tex \
texlive-pst-bezier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
