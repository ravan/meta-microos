SUMMARY = "Draw ellipses and elliptical arcs using the standard LaTeX2e picture environment"
DESCRIPTION = "Draw ellipses and elliptical arcs using the standard LaTeX2e \
picture environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39025"

RPM_NAME = "texlive-ellipse-2026.226.1.0svn39025-61.4.noarch.rpm"
RPM_HASH = "2a828ee71ebc222dd55854304c0e9149fa558e8fdc951a6227494806e0630a00f23bce3c4ebad15ec30e09730d5e282604e7b737e0b1e853e76d8252fd6ebddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipse.sty \
texlive-ellipse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
