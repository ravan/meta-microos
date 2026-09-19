SUMMARY = "Beamer theme based on Metropolis"
DESCRIPTION = "Moloch is a clean and simple beamer theme. It is a fork of the \
Metropolis theme, but has a more minimalistic and slightly less \
opinionated design."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn77913"

RPM_NAME = "texlive-moloch-2026.226.2.2.0svn77913-61.2.noarch.rpm"
RPM_HASH = "313f10b49b6d403a974121601a5df716ca454a1e457dc17a9497f3ea538da080b1a3cec2517fd8bfdd3f58c1b8826f626e54788ac1472aa4be409c154f619dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthememoloch-highcontrast.sty \
tex-beamercolorthememoloch-tomorrow.sty \
tex-beamercolorthememoloch.sty \
tex-beamerfontthememoloch.sty \
tex-beamerinnerthememoloch.sty \
tex-beamerouterthememoloch.sty \
tex-beamerthememoloch.sty \
texlive-moloch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-keyval.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
