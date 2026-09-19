SUMMARY = "Draw two-dimensional Euclidean lattices with TikZ"
DESCRIPTION = "This package provides a simple, efficient and easily \
configurable way to draw two-dimensional Euclidean lattices \
using TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72985"

RPM_NAME = "texlive-euclidean-lattice-2026.226.1.0svn72985-59.2.noarch.rpm"
RPM_HASH = "d17a517991b2b05ed11c16e721104b81d3196b1d8087f00f712d8da0fb07b660e1a36f035f8ff39e475bb1ab2d9f7232a6d5f40722902847c8e7745e9f4bd85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euclidean-lattice.sty \
texlive-euclidean-lattice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
