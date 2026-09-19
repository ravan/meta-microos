SUMMARY = "Classes for University of Manchester Dept of Computer Science"
DESCRIPTION = "The bundle provides thesis and project report document classes \
from the University of Manchester's Department of Computer \
Science."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23861"

RPM_NAME = "texlive-muthesis-2026.226.svn23861-61.2.noarch.rpm"
RPM_HASH = "57356044ab29c2d1790f550f7b2cb23910199eb02ba251de63b3987b4e49bceeed3768a99d10bc27b90e027a85a041440efdd54ce65b0e5d131383cfb5c41c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-muthesis.cls \
tex-third-rep.cls \
texlive-muthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-report.cls \
tex-setspace.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
