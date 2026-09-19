SUMMARY = "Origami-style folding paper CD case"
DESCRIPTION = "This package implements a LaTeX style file to produce \
origami-style folding paper CD cases."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-papercdcase-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "d8cd3a266dc6d0ed391b3dddb4f24a96865bdf0cf206b2f3c3daa1cabccb6a43d26d3854357f59edc5b8b79d5bd812306d80b224e3b09c319699bafb51f2c12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papercdcase.sty \
texlive-papercdcase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
