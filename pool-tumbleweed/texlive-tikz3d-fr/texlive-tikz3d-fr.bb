SUMMARY = "Work with some 3D figures"
DESCRIPTION = "This is a package for working with some 3D figures."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.5svn75291"

RPM_NAME = "texlive-tikz3d-fr-2026.226.0.0.1.5svn75291-59.2.noarch.rpm"
RPM_HASH = "f10d4584d0fc1b46395f2f2211c8c3667724db63e09bb0297763f4d3c91b8543b7e7db96a6eec9438a52e8f8d5d2ac9bfb7b4484da4cb5c1dc1116d12fa07206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz3d-fr.sty \
texlive-tikz3d-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-randomlist.sty \
tex-simplekv.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
