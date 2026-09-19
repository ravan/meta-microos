SUMMARY = "Parallel Computing for Octave"
DESCRIPTION = "Parallel execution package. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "octave-forge-parallel-4.0.2-3.1.aarch64.rpm"
RPM_HASH = "3ca77c49decfcc55c98b4506cd2bf359c1998207e0cb04d894a128b535e65d0575b01576b52ffbc9762a0fc60db11b7984faaad8b546ed10e16ca1ffd02d0ed0"

RPROVIDES:${PN} += "octave-forge-parallel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-struct"

inherit rpm
