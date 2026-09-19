SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi5-devel-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "9772d83e0c0d37ffa4e3744c64d1078e64b62a88e126bc8d0e670b7039ea8a297777ea3e7d24bae4c0fecb5abf9bde201bba4ca40cca42f4d2c65d48114facc2"

RPROVIDES:${PN} += "mumps-openmpi5-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi5 \
mumps-devel \
openmpi5-devel \
scalapack-openmpi5-devel"

inherit rpm
