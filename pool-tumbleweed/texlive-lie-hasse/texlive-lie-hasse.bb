SUMMARY = "Draw Hasse diagrams"
DESCRIPTION = "This package draws Hasse diagrams of the partially ordered sets \
of the simple roots of any complex simple Lie algebra. It uses \
the Dynkin diagrams package dynkin-diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn75301"

RPM_NAME = "texlive-lie-hasse-2026.226.1.02svn75301-61.2.noarch.rpm"
RPM_HASH = "04dc4a9774dcad1ac5a7c1dfb61510403a0c3d1e6d56d06fb8b6d82b2c2cd9396a3950117b21a43a98b90cfc5f17fc1fdbae88d176e4f749f350b0d3a04cd881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lie-hasse.sty \
texlive-lie-hasse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-contour.sty \
tex-dynkin-diagrams.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
