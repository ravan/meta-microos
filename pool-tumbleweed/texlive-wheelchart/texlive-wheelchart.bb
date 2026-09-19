SUMMARY = "Diagrams with circular or other shapes using TikZ and LaTeX3"
DESCRIPTION = "This package is based on the package TikZ and can be used to \
draw various kinds of diagrams such as bar charts, doughnut \
charts, infographics, pie charts, ring charts, square charts, \
sunburst charts, waffle charts and wheel charts. It provides \
several options to customize the diagrams. It is also possible \
to specify a plot for the shape of the chart. Furthermore a \
legend can be added and the table of contents can be displayed \
as one of these diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn78219"

RPM_NAME = "texlive-wheelchart-2026.226.5.0svn78219-60.2.noarch.rpm"
RPM_HASH = "21ab5683cb0cc6e78c450f9552a0af2d81ea74b4c7a274046f4c1c9c2778b4de9d01d2f67eaf1491134f3ef1ff11b2a20f15fc66b6c95ebef1ec6cb3ddb911ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wheelchart.sty \
texlive-wheelchart"

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
