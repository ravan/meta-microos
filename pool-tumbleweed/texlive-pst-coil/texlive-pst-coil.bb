SUMMARY = "A PSTricks package for coils, etcetera"
DESCRIPTION = "Pst-coil is a PSTricks based package for coils and zigzags and \
for coil and zigzag node connections."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.08svn77682"

RPM_NAME = "texlive-pst-coil-2026.226.1.08svn77682-59.2.noarch.rpm"
RPM_HASH = "bd30b4f54585fa9ad03e365f5bfc63014801fa93b91b9710132671ce96f5ba9529745b120524390f41f9eeb7bea28e51615aa2b125079a2d812646dd5897e3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-coil.sty \
tex-pst-coil.tex \
texlive-pst-coil"

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
