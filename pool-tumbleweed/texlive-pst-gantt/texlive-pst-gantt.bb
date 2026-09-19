SUMMARY = "Draw GANTT charts with PSTricks"
DESCRIPTION = "The package uses PSTricks to draw GANTT charts, which are a \
kind of bar chart that displays a project schedule. The package \
requires the pstricks apparatus, of course."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-2026.226.0.0.22asvn35832-59.2.noarch.rpm"
RPM_HASH = "83abce5774fd81bf51e2707433c656148c790d3422ce3010a9eee0a5c3e590e85424726877ace33e19f5738c7031390253bde46d1f77f861d72951251aff2cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-gantt.sty \
tex-pst-gantt.tex \
texlive-pst-gantt"

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
