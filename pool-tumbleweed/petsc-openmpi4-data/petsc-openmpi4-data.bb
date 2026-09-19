SUMMARY = "Data and other shared files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations. \
 \
This package provides data and other shared files for use by petsc shared \
library and devel package."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-openmpi4-data-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "cd2bc87f0f2cad3916cc7533f9160f3255b9447b8633352939cc790b2084817a9cec30845371cfe74bc9663b84d62544ab4a7da168e142465c5179873b24df4f"

RPROVIDES:${PN} += "petsc-openmpi4-data"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
