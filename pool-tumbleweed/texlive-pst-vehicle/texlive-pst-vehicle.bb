SUMMARY = "A PSTricks package for rolling vehicles on graphs of mathematical functions"
DESCRIPTION = "This package permits to represent vehicles rolling without \
slipping on mathematical curves. Different types of vehicles \
are proposed, the shape of the curve is to be defined by its \
equation 'y=f(x)' in algebraic notation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-2026.226.1.3svn61438-60.4.noarch.rpm"
RPM_HASH = "b70f976b0e29222e2d904807bee30e1e23bf777b290d890c46d1a3677b84103c2333349d7a89a8854adeea57f43b69658507841633837f6a682af8cc8b2c3d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-vehicle.sty \
tex-pst-vehicle.tex \
texlive-pst-vehicle"

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
