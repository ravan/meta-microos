SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_flavor} and ."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-5.3.5-7.6.aarch64.rpm"
RPM_HASH = "ea6d31e6b50b6aca867c8515a04dc9ba24055593190d5b4214f775149f434e4ee4b610916c432aee879406f58bd8d43b64412dbe6a19140f387da48d523b4f1c"

RPROVIDES:${PN} += "libcmumps-seq.so.5.3.5 \
libdmumps-seq.so.5.3.5 \
libmpiseq-seq.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps5-3-5 \
libpord-seq.so.5.3.5 \
libsmumps-seq.so.5.3.5 \
libzmumps-seq.so.5.3.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
