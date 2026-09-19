SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-openmpi-2026.1-2.1.aarch64.rpm"
RPM_HASH = "697dd348e89216879027f55b27d4a3a38634b9c7368c3c05f7993ad7d6c6c130b1105fc320c9765e94a7a4a6c3978ad2c84764075f91544937ce85313e3d01c5"

RPROVIDES:${PN} += "gromacs-openmpi"

RDEPENDS:${PN} += "gromacs-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs-mpi.so.11 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
