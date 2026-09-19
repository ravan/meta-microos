SUMMARY = "Simple consecutive numbering of chemical compounds"
DESCRIPTION = "The chemcompounds package allows for a simple consecutive \
numbering of chemical compounds. Optionally, it is possible to \
supply a custom name for each compound. The package differs \
from the chemcono package by not generating an odd-looking list \
of compounds inside the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-chemcompounds-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "e82460b7610295c1babd02402ecd7ae297ea631628e6c88bd22772bad1370af6c4de0889e1997444376ad0a32cf2b094fafbd2ebd0cc5f832cc265cf5a9611bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemcompounds.sty \
texlive-chemcompounds"

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
