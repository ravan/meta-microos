SUMMARY = "A TikZ library for creating track diagrams in railways"
DESCRIPTION = "This TikZ library is a toolbox of symbols geared primarily \
towards creating track schematic for either research or \
educational purposes. It provides a TikZ frontend to some of \
the symbols which may be needed to describe situations and \
layouts in railway operation. The library is divided into \
sublibraries: topology, trafficcontrol, vehicles, \
constructions, electrics, symbology, and measures."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-2026.226.0.0.7.1svn63480-59.2.noarch.rpm"
RPM_HASH = "50700c9e9046e31dcd23f9fb241ef49b12484586311ec5d4d28c92165bb3a0a996f592cc53baf99cc32dc01a82a0db54a670d59b1812a27abf967f04823d29d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-trackschematic.sty \
tex-tikzlibrarytrackschematic.code.tex \
tex-tikzlibrarytrackschematic.constructions.code.tex \
tex-tikzlibrarytrackschematic.electrics.code.tex \
tex-tikzlibrarytrackschematic.measures.code.tex \
tex-tikzlibrarytrackschematic.symbology.code.tex \
tex-tikzlibrarytrackschematic.topology.code.tex \
tex-tikzlibrarytrackschematic.trafficcontrol.code.tex \
tex-tikzlibrarytrackschematic.vehicles.code.tex \
texlive-tikz-trackschematic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
