SUMMARY = "Shapes for drawing flowcharts, using TikZ"
DESCRIPTION = "The package provides a set of 'traditional' flowchart element \
shapes; the documentation shows how to build a flowchart from \
these elements, using pgf/TikZ. The package also requires the \
makeshape package."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn36572"

RPM_NAME = "texlive-flowchart-2026.226.3.3svn36572-60.2.noarch.rpm"
RPM_HASH = "b79eef8f9196cf08e2f93a4c05779aaa18485b34cf5c484863393f1f73923527e045d0d78f9c9a7ae3e794fb02e65c474e5e87d7d65e0b298361cc5c9f933fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flowchart.sty \
texlive-flowchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeshape.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
