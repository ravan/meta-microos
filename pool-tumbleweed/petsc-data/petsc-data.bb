SUMMARY = "Data and other shared files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations. \
 \
This package provides data and other shared files for use by petsc shared \
library and devel package."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-data-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "ee9e1ffd9c033bdadfbc2ccd37f3dd92cb4892ec82e06497f33a3de24593020cb9ca2da518a579f948a03cb7354ee648b03c98b58871606624f7ae1e265e93e4"

RPROVIDES:${PN} += "petsc-data"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
