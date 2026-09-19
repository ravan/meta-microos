SUMMARY = "SEmi Conductor Simulator in 1D for Octave"
DESCRIPTION = "A Drift-Diffusion simulator for 1d semiconductor devices. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0+ & GPL-3.0+"

PV = "0.0.9"

RPM_NAME = "octave-forge-secs1d-0.0.9-1.30.noarch.rpm"
RPM_HASH = "d485d3a6a9eaa7cca6ab90a9afbd5a335a8cc3a3585ee27cc2531e7862c000f87b689e88f9c13bbae0258a6c693bdae8baef99df702ca6bf5c21c82601f2a47d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-secs1d"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-bim"

inherit rpm
