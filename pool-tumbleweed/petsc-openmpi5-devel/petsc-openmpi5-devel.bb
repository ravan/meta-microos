SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-openmpi5-devel-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "eca79caf64cbd6efa35b97302eb61d06c535ebc6591dcc6c2e85ed0089e996dcd2dd5bee9082b7dc18410ffb8809d5c30daafd9a8e1e268ac707f1db4f57381d"

RPROVIDES:${PN} += "petsc-openmpi5-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
blacs-openmpi5-devel \
hdf5-openmpi5-devel \
libpetsc3-25-openmpi5 \
petsc-openmpi5-data \
pkgconfig-yaml-0.1 \
ptscotch-openmpi5-devel \
scalapack-openmpi5-devel \
suitesparse-devel"

inherit rpm
