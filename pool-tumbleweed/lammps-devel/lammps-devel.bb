SUMMARY = "Development headers and libraries for LAMMPS"
DESCRIPTION = "LAMMPS is a classical molecular dynamics code, and an acronym for Large-scale \
Atomic/Molecular Massively Parallel Simulator. \
 \
LAMMPS has potentials for soft materials (biomolecules, polymers) and \
solid-state materials (metals, semiconductors) and coarse-grained or \
mesoscopic systems. It can be used to model atoms or, more generically, as a \
parallel particle simulator at the atomic, meso, or continuum scale. \
 \
LAMMPS runs on single processors or in parallel using message-passing \
techniques and a spatial-decomposition of the simulation domain. The code is \
designed to be easy to modify or extend with new functionality. \
 \
This package contains development headers and libraries for LAMMPS."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20250722.03"

RPM_NAME = "lammps-devel-20250722.03-1.6.aarch64.rpm"
RPM_HASH = "e9e7f834213a98f85ad4b5463063a01ad1343d3f73dabcdabf056dded0646afab52abb340a04041214ba8e6db96e6b2d478bb7c93f72bfb6df35477e62257631"

RPROVIDES:${PN} += "cmake-LAMMPS \
lammps-devel \
pkgconfig-liblammps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lammps \
liblammps0"

inherit rpm
