SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi5-5.3.5-7.7.aarch64.rpm"
RPM_HASH = "08a55d3d9341fcafa100f27d7a29c32bded76e0355af7adce0ead1484de615441a26255d97c0f57caa59dcbd113ac9400b48c0544c6b0a9fc6bdd2bfd8c18593"

RPROVIDES:${PN} += "libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-openmpi5 \
libpord.so.5.3.5 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.2.2 \
libblacs2-openmpi5 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libscalapack.so.2.2.2"

inherit rpm
