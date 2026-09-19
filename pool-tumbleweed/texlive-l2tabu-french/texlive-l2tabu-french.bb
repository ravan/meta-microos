SUMMARY = "French translation of l2tabu"
DESCRIPTION = "French translation of l2tabu."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn31315"

RPM_NAME = "texlive-l2tabu-french-2026.226.2.3svn31315-63.2.noarch.rpm"
RPM_HASH = "25eec63d757ce0f5956f08c51e923afaafa40c93d974fa6a3c1468ec514e837bc7ca28a9773614de61ba586084805a2527697d210a3c5518a9491fc2c8660556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-french"

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
