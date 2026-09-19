SUMMARY = "Data and other shared files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations. \
 \
This package provides data and other shared files for use by petsc shared \
library and devel package."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "petsc-openmpi5-data-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "57a0f7f9a1dc586d59ac1a15dfb8725f0a2fba8f4d43b1a9d00bfd73bb7e8d5f65093b58ba3111336ffbd1727508634aafae29909f11b0b85dfdfc15dd98fadf"

RPROVIDES:${PN} += "petsc-openmpi5-data"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
