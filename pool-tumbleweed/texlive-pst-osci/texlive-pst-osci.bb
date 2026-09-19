SUMMARY = "Oscgons with PSTricks"
DESCRIPTION = "This PSTricks package enables you to produce oscilloscope \
'screen shots'. Three channels can be used to represent the \
most common signals (damped or not): namely sinusoidal, \
rectangular, triangular, dog's tooth (left and right oriented). \
The third channel allows you to add, to subtract or to multiply \
the two other signals. Lissajous diagrams (XY-mode) can also be \
obtained."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.82bsvn68781"

RPM_NAME = "texlive-pst-osci-2026.226.2.82bsvn68781-59.2.noarch.rpm"
RPM_HASH = "104ae8b3013a41545264e6a42b6d27f6bf3e5a1fdafc0905171625edce5959d03c5ff5e50219c303cbd1090e1164c383e9a36a0ed5ad8a0bbf95eea829ccdbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-osci.sty \
tex-pst-osci.tex \
texlive-pst-osci"

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
