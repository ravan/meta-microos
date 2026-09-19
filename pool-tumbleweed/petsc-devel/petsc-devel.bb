SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-devel-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "af919725fea31ecbfc45fef9f332a73968427dc682815027cec981e2d70d4312e49fa1acb4bcbf987f9126b694591b53bdd8b8aefabd636475cf9b468df3bf8c"

RPROVIDES:${PN} += "petsc-devel \
pkgconfig-PETSc \
pkgconfig-petsc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
hdf5-devel \
libpetsc3-25 \
metis-devel \
petsc-data \
pkgconfig-yaml-0.1 \
suitesparse-devel"

inherit rpm
