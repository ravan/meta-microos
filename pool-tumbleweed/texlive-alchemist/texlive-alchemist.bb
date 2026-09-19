SUMMARY = "Typeset alchemist and astrological symbols"
DESCRIPTION = "This style file makes the alchemical and astrological symbols \
accessible in Unicode."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.00svn66924"

RPM_NAME = "texlive-alchemist-2026.226.1.00svn66924-61.2.noarch.rpm"
RPM_HASH = "dd7bb11d8aca3dea53157938ca40d5831a0cf04e6a195ef5657332f0e96e269f7c4eb52ac96c51b100f0fd909aa66277b186e0a8dfe16f57699b2a88b44eca2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alchemist.sty \
texlive-alchemist"

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
