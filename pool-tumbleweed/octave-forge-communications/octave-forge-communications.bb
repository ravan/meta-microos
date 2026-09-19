SUMMARY = "Digital Communications for Octave"
DESCRIPTION = "Digital Communications, Error Correcting Codes (Channel Code), \
Source Code functions, Modulation and Galois Fields. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "octave-forge-communications-1.2.7-2.1.aarch64.rpm"
RPM_HASH = "2ffaaea6964572f9d9e636abf2736ace1c965f66c5be5b79e7f133b8a3e0be10c0ff8661a17bfa032ad4ffd49d5e15e8a9e9810f1a6ac621f9debfbf4fd54b90"

RPROVIDES:${PN} += "octave-forge-communications"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-signal"

inherit rpm
