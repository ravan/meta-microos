SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi5-devel-static-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "6ff9e558a466cb83781fcc71c4a0e53b056c7380c1fd3a8dae3a5391ff4eb3c8995a92a2bf5df4825b84a17a4ae326777e8fdabe5c9ab8d4447ff6002073863f"

RPROVIDES:${PN} += "mumps-openmpi5-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
