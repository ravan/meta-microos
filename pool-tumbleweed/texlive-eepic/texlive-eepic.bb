SUMMARY = "Extensions to epic and the LaTeX drawing tools"
DESCRIPTION = "Extensions to epic and the LaTeX picture drawing environment, \
include the drawing of lines at any slope, the drawing of \
circles in any radii, and the drawing of dotted and dashed \
lines much faster with much less TeX memory, and providing \
several new commands for drawing ellipses, arcs, splines, and \
filled circles and ellipses. The package uses tpic \\special \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1esvn77682"

RPM_NAME = "texlive-eepic-2026.226.1.1esvn77682-61.4.noarch.rpm"
RPM_HASH = "652669f0fc9ee417b0a881341d8964ba50879ef795d8d382a6f9f7707cb076feab43aedacef87c046d4813aad353baab0e6c2e8a514caea1b7bf1e5bad71bc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eepic.sty \
tex-eepicemu.sty \
tex-epic.sty \
texlive-eepic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
