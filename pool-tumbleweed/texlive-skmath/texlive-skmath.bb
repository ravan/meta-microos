SUMMARY = "Extensions to the maths command repertoir"
DESCRIPTION = "The package provides a selection of new maths commands and \
improved re-definitions of existing commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-2026.226.0.0.5asvn52411-64.2.noarch.rpm"
RPM_HASH = "5d98ee5dea357a7327dc4bf914bf0fff51bb63fa5712de51d76afbddd19fe5e8342089eb403472a1a4333ce2f51a111005c40af640218714642c48f70211bb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skmath.sty \
texlive-skmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-expl3.sty \
tex-isomath.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
