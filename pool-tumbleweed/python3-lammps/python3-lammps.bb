SUMMARY = "LAMMPS python module"
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
This subpackage contains LAMMPS's Python module."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20250722.03"

RPM_NAME = "python3-lammps-20250722.03-1.6.noarch.rpm"
RPM_HASH = "f6b8ee06f52196089e7526f8a63038ae3957bc1d6c0761f7c98ff9443c7d32c608a76f70b3fc1c9377d8203e6a661d27e6fbb9c7979d5bd9311638ba069fd55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lammps-/usr/lib64/python3.13/site-packages/lammps.py \
python3-lammps \
python3.13dist-lammps \
python3dist-lammps"

RDEPENDS:${PN} += "liblammps0 \
python-abi"

inherit rpm
