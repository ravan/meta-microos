SUMMARY = "Geometry toolbox for Octave"
DESCRIPTION = "Geometry toolbox for 2D/3D geometric computing. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause"

PV = "1.2.4"

RPM_NAME = "octave-forge-matgeom-1.2.4-2.7.noarch.rpm"
RPM_HASH = "23dd40c82710d785ce67009176e10f3db26580185f4ec30d7901ec75191f21c2e96e4f4fad366d1a955a8de5d6b5a33082629bc74849fa52dac70e122e2c306b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-matgeom"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
