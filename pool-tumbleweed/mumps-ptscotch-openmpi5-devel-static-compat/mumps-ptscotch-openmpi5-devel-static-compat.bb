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

RPM_NAME = "mumps-ptscotch-openmpi5-devel-static-compat-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "d8729af2b9f67f61614b0b6c443ccf7efb797f895d299a1f892f1e19b3d072a3675616e587d4deffa5a8859e0ca058f67b3eec6e4fba7ab74af2a154b4d2b1e0"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi5-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
