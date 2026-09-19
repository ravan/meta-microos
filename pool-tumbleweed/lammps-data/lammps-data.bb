SUMMARY = "LAMMPS data"
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
This subpackage contains LAMMPS's potential files"
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20250722.03"

RPM_NAME = "lammps-data-20250722.03-1.6.noarch.rpm"
RPM_HASH = "9196fe7522c64494f4e70352ebd27688ae8ccbed47717b096c2d4fe53e4e6619116ab11d03b2f6d80c2674e239d5af14c122caf658def9364f4aae6fe1904d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lammps-data \
lammps-data"

RDEPENDS:${PN} += ""

inherit rpm
