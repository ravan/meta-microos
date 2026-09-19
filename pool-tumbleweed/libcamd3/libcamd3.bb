SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "CAMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
CAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libcamd3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "d3f12cd8db2f1af46b094c669ff9973ca914ac002e9f7406273a61a10ac74c6b74420f37d4d470d06e5f20b9bbe2706ff55d75ff87a8c1e4655c8b646e2a92a1"

RPROVIDES:${PN} += "libcamd.so.3 \
libcamd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
