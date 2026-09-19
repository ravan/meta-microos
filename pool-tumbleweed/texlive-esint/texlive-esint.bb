SUMMARY = "Extended set of integrals for Computer Modern"
DESCRIPTION = "The esint package permits access to alternate integral symbols \
when you are using the Computer Modern fonts. In the original \
set, several integral symbols are missing, such as \\oiint. Many \
of these symbols are available in other font sets (pxfonts, \
txfonts, etc.), but there is no good solution if you want to \
use Computer Modern. The package provides Metafont source and \
LaTeX macro support."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-esint-2026.226.1.2dsvn77682-61.4.noarch.rpm"
RPM_HASH = "3bd60a8a1a909c369fb6c746926006bd0cfcf6d644394f517ff941148a0e780aec1be4a31556bf6d6ff29c8e9344f920a17ec5181aa4119bd9495e6f74429da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esint.sty \
tex-esint10.tfm \
tex-uesint.fd \
texlive-esint"

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
