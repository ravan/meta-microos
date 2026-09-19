SUMMARY = "Molecular Orbital PACkage"
DESCRIPTION = "MOPAC is a computational chemistry software package that implements a \
variety of semi-empirical quantum chemistry methods based on the neglect of \
diatomic differential overlap (NDDO) approximation and fit primarily for \
gas-phase thermochemistry"
LICENSE = "Apache-2.0"

PV = "23.2.5"

RPM_NAME = "openmopac-23.2.5-1.3.aarch64.rpm"
RPM_HASH = "f73e131a8a2a8167a04d142b128bcd9156990b9c33460a3c8efd1e606f9c4dea89d3343614b14f83cff2ef14d9b17a4d1a0caea4e394704d14558d2b347f721d"

RPROVIDES:${PN} += "mopac7 \
openmopac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libmopac.so.2"

inherit rpm
