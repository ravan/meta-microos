SUMMARY = "Three dimensional lighting effects (PSTricks)"
DESCRIPTION = "A PSTricks package for three dimensional lighting effects on \
characters and PSTricks graphics, like lines, curves, plots, \
..."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-2026.226.0.0.12svn15878-59.2.noarch.rpm"
RPM_HASH = "c8d3dadac17320a63da41a9ce1ce5686a7a6a35cf7cf19c432405ad812fb9bc076c99b88407452c0eb4049ff1d32037aa9d132ae70be6b8fdbf4280fef17afd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-light3d.sty \
tex-pst-light3d.tex \
texlive-pst-light3d"

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
