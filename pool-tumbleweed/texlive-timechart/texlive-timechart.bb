SUMMARY = "A package for drawing chronological charts"
DESCRIPTION = "This package provides for the easy creation of chronological \
charts which show visually the relative historical positions of \
people and events. Each event or period can be specified by a \
single line of LaTeX code comprising (possibly uncertain) start \
and finish dates and a label, and the package takes care of \
indicating the uncertainties and whether intervals extend \
beyond the specified bounds of the chart."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.56.1svn76924"

RPM_NAME = "texlive-timechart-2026.226.0.0.56.1svn76924-59.2.noarch.rpm"
RPM_HASH = "dedcdaaaa63a9ecde70b6b1ee26971d5dd231c0e0e44bf955da3f05cacd024df5c415842cc2235b5f773bb3daa78582ade1c5588e63aa23753fe872d8a4c9c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timechart.sty \
texlive-timechart"

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
