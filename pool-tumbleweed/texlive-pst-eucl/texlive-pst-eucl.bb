SUMMARY = "Euclidean geometry with PSTricks"
DESCRIPTION = "The package allows the drawing of Euclidean geometric figures \
using TeX pstricks macros for specifying mathematical \
constraints. It is thus possible to build point using common \
transformations or intersections. The use of coordinates is \
limited to points which controlled the figure."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.77svn77682"

RPM_NAME = "texlive-pst-eucl-2026.226.1.77svn77682-59.2.noarch.rpm"
RPM_HASH = "feaabf091c9f6fbcaaf13393ee3c6850181a206f7523f15896789ea14f65a77925b841194994084e042d0f2371a233847e0864c0623f8bbea2b86a8ebb7bd1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eucl.sty \
tex-pst-eucl.tex \
texlive-pst-eucl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-calculate.sty \
tex-pst-node.sty \
tex-pst-tools.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
