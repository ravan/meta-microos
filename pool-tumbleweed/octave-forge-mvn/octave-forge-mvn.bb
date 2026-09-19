SUMMARY = "Multivariate normal distribution clustering and utility functions for Octave"
DESCRIPTION = "Multivariate normal distribution clustering and utility functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.1.0"

RPM_NAME = "octave-forge-mvn-1.1.0-1.32.noarch.rpm"
RPM_HASH = "88448695795bba3ce13cd32e04ba527f4c5fb17ecb121f2b49cae1c84058375986c9e8e1742c03c64f51d6c9f26069d6d9138b566cc228ff08e81b1a778e460d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-mvn"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
