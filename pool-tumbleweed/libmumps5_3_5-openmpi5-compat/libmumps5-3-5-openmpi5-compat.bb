SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi5."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi5-compat-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "4e796f8303969bdfd1953c1cad4135601f01632d33397743fcc88d7b092e292d2d492c6d8453bd1cd69dd52d11f38f99d30648e38788e54320e04bd9329db2ed"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi5-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
