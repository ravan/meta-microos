SUMMARY = "Polygons with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstPolygon that will draw various regular and non-regular \
polygons (according to command parameters); various shortcuts \
to commonly-used polygons are provided, as well as a command \
\\pspolygonbox that frames text with a polygon. The package uses \
the xkeyval package for argument decoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.63svn35062"

RPM_NAME = "texlive-pst-poly-2026.226.1.63svn35062-60.4.noarch.rpm"
RPM_HASH = "43387bead1802c7c9f66ed69626462a4580e73452ff14ecc592a331e9cef102a0da1c019b5a3dd9443e74ebbe55ee607d70128b6f88810b2592244599d6ebf66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poly.sty \
tex-pst-poly.tex \
texlive-pst-poly"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
