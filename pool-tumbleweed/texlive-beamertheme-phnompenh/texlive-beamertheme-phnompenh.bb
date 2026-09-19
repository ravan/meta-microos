SUMMARY = "A simple beamer theme"
DESCRIPTION = "The package provides a simple theme, similar to some others, \
but designed to be attractive."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-2026.226.1.0svn39100-61.2.noarch.rpm"
RPM_HASH = "cc325ed8f5fe1886d6bbdee987540e1dbd4b8bddda88f6c5e5816c0d4e1fb4d63d0c99df9b16346d79965cbacf2e130575f0bd0c6c65c556dc9f2dc5ffe6577e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemePhnomPenh.sty \
texlive-beamertheme-phnompenh"

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
