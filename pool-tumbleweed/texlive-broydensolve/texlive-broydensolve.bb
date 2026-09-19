SUMMARY = "Solve a system of equations with Broyden's good method"
DESCRIPTION = "This package implements Broyden's good method to solve a system \
of equations. It is also possible to use coordinates defined by \
TikZ as known and unknown variables."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-broydensolve-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "300a42a0953c208e0503d2083bcde9e2e80ef322314cf719b331818a42f52c5d9b136817037d342e6fb72d49b8876fd6b8673a9c7318a8c5fc2d3d146bde7822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-broydensolve.sty \
texlive-broydensolve"

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
