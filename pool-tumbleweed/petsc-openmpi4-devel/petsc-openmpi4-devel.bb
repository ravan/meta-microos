SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-openmpi4-devel-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "414cf5d8bd4bb992b84250cc3e42f71ce7457e91380efe0e375b11cb324a99236f765351b0dc7a001fdbab82844175c627f8f2b28e8b3af7f9019519be3f638b"

RPROVIDES:${PN} += "petsc-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
blacs-openmpi4-devel \
hdf5-openmpi4-devel \
libpetsc3-25-openmpi4 \
petsc-openmpi4-data \
pkgconfig-yaml-0.1 \
ptscotch-openmpi4-devel \
scalapack-openmpi4-devel \
suitesparse-devel"

inherit rpm
