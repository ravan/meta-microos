SUMMARY = "Typeset linear operators as they appear in quantum theory or linear algebra"
DESCRIPTION = "This small package aims to provide two simple commands and many \
options to easily write linear operators as they appear in \
many-body physics, quantum theory, and linear algebra, in any \
of the ways commonly in use."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn41304"

RPM_NAME = "texlive-linop-2026.226.0.0.1svn41304-61.2.noarch.rpm"
RPM_HASH = "3d4801112f52e11f3f31a84bb47c848d18130c3214a847cf14eba5d455c387782ba5c4ab45e648643a60306527b7622af2de8f6d03a3c9c11f66d099a69eb2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linop.sty \
texlive-linop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bm.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
