SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi5-devel-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "18d2c6d9bbade41956dbcfcc892d09be8ab2e62fac2ee2904b91c500f8ed04abb8be5e2baec44ce3d3ecd47b3e55fe991212da1f7b763dbcd12e163223b7f44b"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi5-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi5 \
mumps-devel \
mumps-scotch-devel \
openmpi5-devel \
ptscotch-openmpi5-devel \
scalapack-openmpi5-devel"

inherit rpm
