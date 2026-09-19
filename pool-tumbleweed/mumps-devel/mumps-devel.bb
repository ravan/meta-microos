SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-5.3.5-7.6.aarch64.rpm"
RPM_HASH = "e1d244e14d93e83dc6d889ee73c3f21151c1f8ae8ee11104fee12ce999abb3415fce6816551887ac0a800122bc1d48c83328d69c451f423491ca556b1c0e8ecc"

RPROVIDES:${PN} += "mumps-devel"

RDEPENDS:${PN} += "blas-devel \
lapack-devel \
libmumps5-3-5"

inherit rpm
