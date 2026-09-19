SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_flavor} and  with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-scotch5_3_5-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "65cc2a72f34f906594e41dc3b1ccfa9959131e6bffca1dff3d70517a03309db44a6f76c43b21c72065d9ef93e676984a7ba502d2787fd1f3cbc8b6171c23c6a2"

RPROVIDES:${PN} += "libcmumps-scotch.so.5.3.5 \
libdmumps-scotch.so.5.3.5 \
libmpiseq-scotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-scotch5-3-5 \
libpord-scotch.so.5.3.5 \
libsmumps-scotch.so.5.3.5 \
libzmumps-scotch.so.5.3.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libscotch.so.7.0"

inherit rpm
