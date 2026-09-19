SUMMARY = "Draw Gantt charts with TikZ"
DESCRIPTION = "The package provides an environment for drawing Gantt charts \
that contain various elements (titles, bars, milestones, groups \
and links). Several keys customize the appearance of the chart \
elements."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0asvn71565"

RPM_NAME = "texlive-pgfgantt-2026.226.5.0asvn71565-58.2.noarch.rpm"
RPM_HASH = "65431b4e1cc3233a6264ce9b275f0ecadc559782f916c8f8633318f235e9665579120431f1cfd22e8962e2dd1309c781123cf270179fb568b3e2e2c2dd5967f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfgantt.sty \
texlive-pgfgantt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfcalendar.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
