SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "d1294a9747a23f7946b332d27a5e6d0081d930897e1884b3dc96a1c53502373140796c43ec5bfd714bb5702db1d4f067117d44e8403a8c29063ce226b6df5083"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
