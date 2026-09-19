SUMMARY = "Algorithms for smoothing noisy data"
DESCRIPTION = "Algorithms for smoothing noisy data. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.0"

RPM_NAME = "octave-forge-data-smoothing-1.3.0-1.32.noarch.rpm"
RPM_HASH = "384dcd103d5b36ac28f8f393ce0aa174141c222371f1b31f4aa6ba12631ab3ecf25999fcbf30938569510f5fb3d905fb6522b39ed3911eb3b1e7c893f39a7313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-data-smoothing"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-optim"

inherit rpm
