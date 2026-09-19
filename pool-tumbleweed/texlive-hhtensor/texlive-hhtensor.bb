SUMMARY = "Print vectors, matrices, and tensors"
DESCRIPTION = "This package provides commands for vectors, matrices, and \
tensors with different styles -- arrows (as the LaTeX default), \
underlined, and bold."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-2026.226.0.0.61svn54080-60.4.noarch.rpm"
RPM_HASH = "e3d004f244d26b9d75f8c416117e79d1a5973c8ebbcdedcb166c826e51b55ee24cb1323d5bdbaef9bac451a89499134cb4c0af18c5e210557a0e18a79bbdf6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhtensor.sty \
texlive-hhtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ushort.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
