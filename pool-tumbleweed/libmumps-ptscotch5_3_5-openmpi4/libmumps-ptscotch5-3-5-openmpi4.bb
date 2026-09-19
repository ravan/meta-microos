SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi4-5.3.5-7.8.aarch64.rpm"
RPM_HASH = "545caf549cf2e39e332894547290031fa2028d16b7b5018782b617286dc51cbaa9978a1cad76ec4470711861687c5c1b4327ca77bd5d9380a60e7e67c16a898a"

RPROVIDES:${PN} += "libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi4 \
libpord-ptscotch.so.5.3.5 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.2.2 \
libblacs2-openmpi4 \
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
libptscotch.so.7.0 \
libscalapack.so.2.2.2"

inherit rpm
