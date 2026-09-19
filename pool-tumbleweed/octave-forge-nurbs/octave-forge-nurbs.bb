SUMMARY = "Routines for Non-Uniform Rational B-Splines for Octave"
DESCRIPTION = "Collection of routines for the creation, and manipulation of \
Non-Uniform Rational B-Splines (NURBS). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.4"

RPM_NAME = "octave-forge-nurbs-1.4.4-1.7.aarch64.rpm"
RPM_HASH = "a7ffe2e76c310cca2807c4fb5ba0d91f5672246d6c3eadf3775dd29a9266c18bd5542f4cddc818596e3fffaa00c8302195e7735e2b89c853018fdfdc8ea921bd"

RPROVIDES:${PN} += "octave-forge-nurbs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
