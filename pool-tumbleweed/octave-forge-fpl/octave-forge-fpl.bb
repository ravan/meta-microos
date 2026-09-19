SUMMARY = "Fem PLotting for Octave"
DESCRIPTION = "Collection of routines to export data produced by Finite Elements or Finite \
Volume Simulations in formats used by some visualization programs. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.5"

RPM_NAME = "octave-forge-fpl-1.3.5-1.32.noarch.rpm"
RPM_HASH = "23ffb2b4cf4a63570bcb8116c6ddf38ad06f19274849262e976848e5633e223533cbd81948f1ab2e031fce001738170206da66de8172169169c116d252a798d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fpl"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
