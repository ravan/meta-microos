SUMMARY = "Beamer and scrlttr2 classes and styles for the University of Regensburg"
DESCRIPTION = "The bundle provides a beamer-derived class and a theme style \
file for the corporate design of the University of Regensburg. \
It also contains a scrlttr2-derived class for letters using the \
corporate design of the UR. Users may use the class itself \
(URbeamer) or use the theme in the usual way with \
\\usetheme{UR}. Examples of using both letters and presentations \
are provided as .tex and .pdf-files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn49903"

RPM_NAME = "texlive-urcls-2026.226.2.1svn49903-60.2.noarch.rpm"
RPM_HASH = "c02cc43579466c869d056b477788c48db2212d49fb993c5d6c2615bd8afdbc970bdd7b821dd15942c4977bba4efb2ba2cb86999764d19466c02be8afbf26544b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-URbeamer.cls \
tex-URcolors.sty \
tex-URletter.cls \
tex-URoptions.sty \
tex-URpagestyles.sty \
tex-URrules.sty \
tex-URspecialopts.sty \
tex-beamercolorthemeUR.sty \
tex-beamerfontthemeUR.sty \
tex-beamerouterthemeUR.sty \
tex-beamerthemeUR.sty \
texlive-urcls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beamer.cls \
tex-expl3.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-l3keys2e.sty \
tex-scrlayer-scrpage.sty \
tex-scrlttr2.cls \
tex-textcase.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
