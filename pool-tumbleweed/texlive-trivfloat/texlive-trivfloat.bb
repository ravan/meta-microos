SUMMARY = "Quick float definitions in LaTeX"
DESCRIPTION = "The trivfloat package provides a quick method for defining new \
float types in LaTeX. A single command sets up a new float in \
the same style as the LaTeX kernel figure and table float \
types. The package works with memoir as well as the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77682"

RPM_NAME = "texlive-trivfloat-2026.226.1.3bsvn77682-59.2.noarch.rpm"
RPM_HASH = "f70906859de4266f0eb26e8fc524903cc833e4734abb8ed602574db26411e1c91f58b052395ae6fa54fe17a0bd187f87f42f07be3ca5f269961fdfee51109c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trivfloat.sty \
texlive-trivfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-floatrow.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
