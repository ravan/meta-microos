SUMMARY = "Support for rendering UML diagrams using PlantUML"
DESCRIPTION = "PlantUML is a program which transforms text into UML diagrams. \
This LaTeX package allows for embedding PlantUML diagrams using \
the PlantUML source. Currently, this project runs with LuaLaTeX \
only."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn75196"

RPM_NAME = "texlive-plantuml-2026.226.0.0.6.0svn75196-58.2.noarch.rpm"
RPM_HASH = "39f8dea3580b095c6e3d6788f98fb4cd4b48ae18cdf7fbf0fe0a363feef1660f34e2754dc6cfc78f9ea1bba5a160034ea59309174da681bdc3054ec5223c4ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plantuml.sty \
texlive-plantuml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-luacode.sty \
tex-pdftexcmds.sty \
tex-pythontex.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
