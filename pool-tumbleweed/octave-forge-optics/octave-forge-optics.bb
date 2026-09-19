SUMMARY = "Functions covering various aspects of optics for Octave"
DESCRIPTION = "Functions covering various aspects of optics. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-optics-0.1.4-1.23.noarch.rpm"
RPM_HASH = "4e3be827ef14420dc604e26d979081d03c116b89ba3ab5fd7f71ab4b1f5f94ae983baa291c55eb88ccc52320ca47fdd6c570e4880cb7ef04fa3cf665d1009cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-optics"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
