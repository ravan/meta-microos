SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "706738f4b3a4381b2dd0b6c9bc527d12fecce8043c4608c55fb11601dfef64039fb6654243fd0102c2afb23f4b969c424777fcfe8b809e5017c4448af658cd97"

RPROVIDES:${PN} += "mumps-scotch-devel"

RDEPENDS:${PN} += "blas-devel \
lapack-devel \
libmumps-scotch5-3-5 \
mumps-devel \
scotch-devel"

inherit rpm
