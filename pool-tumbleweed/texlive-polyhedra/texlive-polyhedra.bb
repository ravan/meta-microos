SUMMARY = "A TikZ package for drawing polyhedra"
DESCRIPTION = "This package provides macros for creating polyhedral objects in \
2D and 3D. It requires TikZ and tikz-3dplot. The macros \
provided can be used for drawing vertices, edges, rays, \
polygons and cones."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn68770"

RPM_NAME = "texlive-polyhedra-2026.226.0.0.3svn68770-59.2.noarch.rpm"
RPM_HASH = "335c7f0733e0e511d38db8ddb1ebe6eacb7b4506e26a129a0334f1c3db72a735d9226a1a732bca0019fc24c3fab42928e464263fc1ed6168fd2e85530217245b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polyhedra.sty \
texlive-polyhedra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xcolor-solarized.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
