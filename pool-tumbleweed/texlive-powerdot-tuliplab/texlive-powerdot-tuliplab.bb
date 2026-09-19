SUMMARY = "A style package for Powerdot to provide the design of TULIP Lab"
DESCRIPTION = "powerdot-tuliplab is the LaTeX package used in TULIP Lab for \
presentation drafting. It comes with several sample .tex files \
so that you can quickly start working with it."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn47963"

RPM_NAME = "texlive-powerdot-tuliplab-2026.226.1.0.0svn47963-59.2.noarch.rpm"
RPM_HASH = "09a60e2d87c33926d3cf8b029c2003a0a3775b68d6bee86e67d75170005b2040c2445da846b1c681a92bf39b7a88e2f4b6a63817d151d57d9ca95b3d1ddbf639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-powerdot-tuliplab.sty \
texlive-powerdot-tuliplab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
