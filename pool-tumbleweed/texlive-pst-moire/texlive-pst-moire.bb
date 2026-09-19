SUMMARY = "A PSTricks package to draw moire patterns"
DESCRIPTION = "This is a PSTricks package to draw moire patterns."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn60411"

RPM_NAME = "texlive-pst-moire-2026.226.2.2svn60411-59.2.noarch.rpm"
RPM_HASH = "e460fad5f20692d0e98614c06bae69440982713fc47298a99687c00059e1524708dca448a203411e9caa8bba2bb62019e77703b70a278ce5a87ab0c568d7fece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-moire.sty \
tex-pst-moire.tex \
texlive-pst-moire"

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
