SUMMARY = "Molecular Dynamics Simulator"
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
designed to be easy to modify or extend with new functionality."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20250722.03"

RPM_NAME = "lammps-20250722.03-1.6.aarch64.rpm"
RPM_HASH = "1298725f20eac90da6b21e1f329d988ff3eb84f28594fac3ee8905eb5b3b6498bfc76797c1e7a091d8b932d34ab337d64ccf2f3a077fe50b2d7d06b0e094aa1a"

RPROVIDES:${PN} += "lammps"

RDEPENDS:${PN} += "lammps-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblammps.so.0 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
