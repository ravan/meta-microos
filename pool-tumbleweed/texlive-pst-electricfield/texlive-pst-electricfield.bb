SUMMARY = "Draw electric field and equipotential lines with PSTricks"
DESCRIPTION = "The package provides macros to plot electric field and \
equipotential lines using PStricks. There may be any number of \
charges which can be placed in a cartesian coordinate system by \
(x,y) values."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-2026.226.0.0.14svn29803-59.2.noarch.rpm"
RPM_HASH = "b5bb420807e9ec01160a178f4c2852ce0a0ff5b6f801a889a902d968cd87e379ef7133f1a3f796107fe91f9c02027c384a2585eb468cacd27a81344c8d0a000b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-electricfield.sty \
tex-pst-electricfield.tex \
texlive-pst-electricfield"

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
