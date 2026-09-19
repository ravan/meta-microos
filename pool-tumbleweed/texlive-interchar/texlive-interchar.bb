SUMMARY = "Managing character class schemes in XeTeX"
DESCRIPTION = "The package manages character class schemes of XeTeX. Using \
this package, you may switch among different character class \
schemes. Migration commands are provided for make packages \
using this mechanism compatible with each others."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-interchar-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "41345680a56512ff16f0cea930be8897822eb98f1dc2b8bb0c9135edc5ac516e4f45c9eb320a5d63f9e4f280492c123bd783f05ca8d61ae083937e493a7a4f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interchar.sty \
texlive-interchar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
