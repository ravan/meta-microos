SUMMARY = "Draw perspective views of 3D solids"
DESCRIPTION = "The package is designed to draw solids in 3d perspective. \
Features include: create primitive solids; create solids by \
including a list of its vertices and faces; faces of solids and \
surfaces can be colored by choosing from a very large palette \
of colors; draw parametric surfaces in algebraic and reverse \
polish notation; create explicit and parameterized algebraic \
functions drawn in 2 or 3 dimensions; project text onto a plane \
or onto the faces of a solid; support for including external \
database files."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.35asvn68786"

RPM_NAME = "texlive-pst-solides3d-2026.226.4.35asvn68786-60.4.noarch.rpm"
RPM_HASH = "3ab5b7a5017813f8e105511b19dd4f710010ecd04a4d3f95435180111004d8dc4128215b82520bf2381cbfa733a67a3d0a931b01c1647880782b0fd0d3ecfeee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-solides3d.sty \
tex-pst-solides3d.tex \
texlive-pst-solides3d"

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
