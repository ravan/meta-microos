SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-static-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "a545be45bc10ff4b4160f51eed768977a9696a5fa4b0a5a3990e319772a744e208f4708b1281d24b910bed1a996e343ab818f4db9151adf59e307fa197adfc01"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
