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

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-compat-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "9480e040dc56142834de60390fd3ec9e1f8ec0c1d7f5a3b6cf594ac7e10b2d6f4e184eb5095d19458bb0138d1cd62eaa4d326a0787a15df2ac354bd5e25f185e"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
