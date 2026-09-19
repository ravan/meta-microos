SUMMARY = "A bimonthly report class for the PhD School of Materials, Mechatronics and System Engineering"
DESCRIPTION = "This package allows to rapidly write the bimonthly report for \
The Ph.D. School in Materials, Mechatronics and System \
Engineering. It allows to define the research activities, the \
participation to school and congress, and the publication \
performed by a student."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45581"

RPM_NAME = "texlive-unitn-bimrep-2026.226.svn45581-60.2.noarch.rpm"
RPM_HASH = "50ce8a5514eb344554565e5c2123dfa7ed45d89fbb93f3bc07250be4831d76df4df7cd7c61c5f9559fc7f746efb1061306a701408bf69d921a001fbc53ee06d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unitn-bimrep.cls \
texlive-unitn-bimrep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-libertine.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
