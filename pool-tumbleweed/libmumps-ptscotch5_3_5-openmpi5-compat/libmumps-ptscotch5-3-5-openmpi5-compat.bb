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

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi5-compat-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "efbcde4cab21ac2b7027158e2b2486d943d005f22817f25afc7bf6bdca1b5523fd975178d4d9742347458b151d143570afd25f39104f4de25a49ac1876d3a191"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi5-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
