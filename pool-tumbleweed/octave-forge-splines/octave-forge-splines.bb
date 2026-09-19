SUMMARY = "Additional spline functions for Octave"
DESCRIPTION = "Additional spline functions. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.3.5"

RPM_NAME = "octave-forge-splines-1.3.5-1.9.noarch.rpm"
RPM_HASH = "0a1043308e6e5ebdd1dc196f7de72fb4a9cdb5e5800255d5cc0be2078812de12018d947ae10a71e7b59950d538c8217092cc71ef292881d4d25ae4ba7d8fcfca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-splines"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
