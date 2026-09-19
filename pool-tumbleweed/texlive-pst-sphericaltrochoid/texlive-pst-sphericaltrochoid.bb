SUMMARY = "Create animations of a spherical trochoid"
DESCRIPTION = "This package simulates the generation of a spherical trochoid \
by a point on a circle rolling without sliding along the edge \
of another circle, but on the same sphere. (See \
https://demonstrations.wolfram.com/SphericalTrochoid/)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77173"

RPM_NAME = "texlive-pst-sphericaltrochoid-2026.226.0.0.01svn77173-60.4.noarch.rpm"
RPM_HASH = "17ca8d2d543d84570de315df75046c3c70b43d9594bb624527347ce9f42f8bcc22ac41dd06f9a402e78083d30a2894c130b293fb7acffff5be40188e4ae9274f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-sphericaltrochoid.sty \
tex-pst-sphericaltrochoid.tex \
texlive-pst-sphericaltrochoid"

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
