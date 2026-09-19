SUMMARY = "Create bond graph figures in LaTeX documents"
DESCRIPTION = "The package draws bond graphs using PGF and TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21670"

RPM_NAME = "texlive-bondgraph-2026.226.1.0svn21670-59.2.noarch.rpm"
RPM_HASH = "79de3bbcb6b9d162fa7fbb6badeefa2f5711ca2d3cb94bbf581124371b8f3d1663fe3023f32cdfd35f53de48a8882bd46d0e9f457634122c0bcd2e8ffd15e56f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraph.sty \
texlive-bondgraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
