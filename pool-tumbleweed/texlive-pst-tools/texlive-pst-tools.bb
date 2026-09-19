SUMMARY = "PSTricks support functions"
DESCRIPTION = "The package provides helper functions for other PSTricks \
related packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-2026.226.0.0.12svn60621-60.4.noarch.rpm"
RPM_HASH = "546c784258c93660d2c7f36014ea8361bdfeec9b046a8548fc059deddd2604dabdda834f4a7f3b4642c1838d79c88e86e3265651a15f186c6a808cbd25b4b65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tools.sty \
tex-pst-tools.tex \
texlive-pst-tools"

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
