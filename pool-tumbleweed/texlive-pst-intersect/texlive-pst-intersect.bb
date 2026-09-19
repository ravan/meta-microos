SUMMARY = "Compute intersections of arbitrary curves"
DESCRIPTION = "The package computes the intersections between arbitrary \
PostScript paths or Bezier curves, using the Bezier clipping \
algorithm."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-2026.226.0.0.4svn33210-59.2.noarch.rpm"
RPM_HASH = "5a510e8664e470beb0032419518f8224007a25f27a2d3449d42c6c70d0f54159a49c2902e80e63f812f530a5927cc444d299dadcd2dce5acccff3e31133a0255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-intersect.sty \
tex-pst-intersect.tex \
texlive-pst-intersect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-func.sty \
tex-pst-node.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
