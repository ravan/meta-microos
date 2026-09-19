SUMMARY = "Reduce the number of unnecessary float pages"
DESCRIPTION = "This package implements a float algorithm extension for \
handling float pages. It attempts to reduce the number of \
unnecessary (fairly empty) float pages while making sure that \
floats nevertheless stay close to their call-outs. Several \
aspects of the algorithm behavior are adjustable."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77682"

RPM_NAME = "texlive-fewerfloatpages-2026.226.1.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "3c75b2e7cd13c62a41dad7e64779459c0362e924281d94ca5d6f3305da4fd774d4ec6e3d468001e3567936f375b0eb5297f67d7532769012ff0a500fe669c85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fewerfloatpages.sty \
texlive-fewerfloatpages"

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
