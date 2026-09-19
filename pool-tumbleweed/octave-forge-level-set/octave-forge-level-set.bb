SUMMARY = "Level-Set functions for Octave"
DESCRIPTION = "Routines for calculating the time-evolution of the level-set equation \
and extracting geometric information from the level-set function. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "octave-forge-level-set-0.3.1-2.6.aarch64.rpm"
RPM_HASH = "cbaf8fbba279bf9db1f49a254ad01bf78a15da072ae89574061d9e976848c56405a812391af17d2e4fbe8c6968ddc8edf7534cf23c7672185a25ea881c2a160b"

RPROVIDES:${PN} += "octave-forge-level-set"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-parallel"

inherit rpm
