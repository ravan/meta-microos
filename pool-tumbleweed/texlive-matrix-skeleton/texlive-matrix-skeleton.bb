SUMMARY = "A PGF/TikZ library that simplifies working with multiple matrix nodes"
DESCRIPTION = "The package provides a PGF/TikZ library that simplifies working \
with multiple matrix nodes. To do so, it correctly aligns \
groups of nodes with the content of the whole matrix. \
Furthermore, matrix.skeleton provides rows and columns for easy \
styling."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-2026.226.1.1svn65013-59.2.noarch.rpm"
RPM_HASH = "55abee2895703f6435ec7afff4bb6b1cbff0e6d29a17e1199669f292936c6553fdd1ccbc4e732b504da8ab0f7180f505db3e91adda188b7c311a43e327b44038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibrarymatrix.skeleton.code.tex \
tex-tikzlibrarymatrix.skeleton.code.tex \
texlive-matrix-skeleton"

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
