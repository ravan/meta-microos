SUMMARY = "Coordinate transformation styles for 3d plotting in TikZ"
DESCRIPTION = "The package provides straightforward ways to define \
three-dimensional coordinate frames through which to plot in \
TikZ. The user can specify the orientation of the main \
coordinate frame, and use standard TikZ commands and \
coordinates to render their tikzfigure. A secondary coordinate \
frame is provided to allow rotations and translations with \
respect to the main coordinate frame. In addition, the package \
can also handle plotting user-specified functions in spherical \
polar coordinates, where both the radius and fill color can be \
expressed as parametric functions of polar angles."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn25087"

RPM_NAME = "texlive-tikz-3dplot-2026.227.svn25087-62.2.noarch.rpm"
RPM_HASH = "553cb0985caf6e46b9bc3eac4f0c138cba59da273a376a2a8f4ad81e177db87322c962452d6d67348bb7a669d2c8af41ffa864e4d971e1bd61d074bb7a6f462f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-3dplot.sty \
texlive-tikz-3dplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
