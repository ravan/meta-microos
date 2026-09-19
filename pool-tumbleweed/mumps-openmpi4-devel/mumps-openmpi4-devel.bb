SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "b03bb7ad4205208c8ab1d3549a2428a09e19dc4c77feab2d3c7facf4b93b2d7c03bb03e1ed9fa7b48c358c7a9712c55312ac827decbba3bf91c018bf9a72406f"

RPROVIDES:${PN} += "mumps-openmpi4-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi4 \
mumps-devel \
openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
