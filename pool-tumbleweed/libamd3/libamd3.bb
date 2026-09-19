SUMMARY = "Symmetric Approximate Minimum Degree"
DESCRIPTION = "AMD is a set of routines for ordering a sparse matrix prior to \
Cholesky factorization (or for LU factorization with diagonal \
pivoting). There are versions in both C and Fortran. A MATLAB \
interface is provided. \
 \
Note that this software has nothing to do with AMD the company. \
 \
AMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libamd3-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "d6d9d5ac32d382125cfaacf6ab2416f13c3a5b2425bedf03544d307c4bc39454d45194df18e775978a5e596e4acc653ae13eae4005fa6c079d4d8a7eebd26d94"

RPROVIDES:${PN} += "libamd.so.3 \
libamd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.7"

inherit rpm
