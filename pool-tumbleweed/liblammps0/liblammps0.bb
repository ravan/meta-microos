SUMMARY = "A molecular dynamics simulator library"
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
This package contains the library of LAMMPS package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20250722.03"

RPM_NAME = "liblammps0-20250722.03-1.6.aarch64.rpm"
RPM_HASH = "a10038c51d61a6cc9ec97389a984092ed3281c1e48eab1449f7de068ce824f93b41f589f8cdae02a572c173deed5d2ddf94504d22d7896e0033fa87da64c032e"

RPROVIDES:${PN} += "liblammps.so.0 \
liblammps0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libkim-api.so.2 \
libm.so.6 \
libmpi.so.40 \
libpng16.so.16 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libvoro++.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
