SUMMARY = "Input/Output in external formats from Octave"
DESCRIPTION = "Input/Output in external formats. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "octave-forge-io-2.7.1-1.2.aarch64.rpm"
RPM_HASH = "3fa7c6898060389d277c1c333b3ca6e0bcf6e3f13cb93a4f2ea008ff4fc4ae9ac781256eeab5c840d2f3d5ecbea8187a995a82ca25e8c3c1f37b08b8c4619245"

RPROVIDES:${PN} += "octave-forge-io"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
xerces-j2"

inherit rpm
