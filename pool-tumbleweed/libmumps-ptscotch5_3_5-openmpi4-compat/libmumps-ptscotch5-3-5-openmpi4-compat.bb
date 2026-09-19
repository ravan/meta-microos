SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi4-compat-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "4045a83463387b16fdc7277b3db82b278f7f70c53ddcc04e14ee817e0ba97f90e49f852fc3f9be18b80ff63747b509167a5ed32d52b67bd77e2fdb6a5183fab4"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi4-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
