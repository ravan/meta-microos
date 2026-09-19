SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.8"

RPM_NAME = "octave-forge-bim-1.1.8-2.6.noarch.rpm"
RPM_HASH = "f0838def5dd470a98d6fff28b09cc24ddf597b71a4c1b18743388b203dfcc0c5518f873e54662bb0f413ccb2f107ea705c6cfca39e9a9712e13caca75d8eb967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-bim"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-fpl \
octave-forge-msh"

inherit rpm
