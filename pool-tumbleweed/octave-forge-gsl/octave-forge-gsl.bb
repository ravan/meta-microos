SUMMARY = "Octave bindings to the GNU Scientific Library"
DESCRIPTION = "Octave bindings to the GNU Scientific Library. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "octave-forge-gsl-2.1.1-1.37.aarch64.rpm"
RPM_HASH = "2e07b505eb1260e435a22b2db56a497c881e9e1722cf5154d8af6a867fc7e222531c50f761cfbb94bbf192886cff5b57fe1dc2444db7d4c0c4ef47cf91ee39e9"

RPROVIDES:${PN} += "octave-forge-gsl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.28 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
