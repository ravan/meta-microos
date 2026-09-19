SUMMARY = "N-dimensional variational analysis for Octave"
DESCRIPTION = "divand performs an n-dimensional variational analysis (interpolation) \
of arbitrarily located observations. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "1.1.2"

RPM_NAME = "octave-forge-divand-1.1.2-1.32.noarch.rpm"
RPM_HASH = "57e2f3c9710c4fd405d69c43a7ec5ce9963525c9a1afd46684e682dd8438ffb2545338ba4e00557f414ce6b897571669554e121611a4ad3199810c8be6af0570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-divand"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
