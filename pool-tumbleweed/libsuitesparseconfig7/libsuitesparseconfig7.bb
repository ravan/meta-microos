SUMMARY = "Common configurations for all packages in SuiteSparse"
DESCRIPTION = "SuiteSparse_config is required by a number of sparse matrix packages, \
including SuiteSparseQR, AMD, COLAMD, CCOLAMD, CHOLMOD, KLU, BTF, \
LDL, CXSparse, RBio, and UMFPACK. It is not required by CSparse, \
which is a stand-alone packages. Mongoose uses SuiteSparse_config, \
if available but works also without it. \
 \
SuiteSparse_config contains a configuration file for 'make' \
(SuiteSparse_config.mk) and an include file (SuiteSparse_config.h). \
Also included in SuiteSparse_config is a replacement for the \
BLAS/LAPACK xerbla routine that does not print a warning message \
(helpful if you don't want to link the entire Fortran I/O library \
into a C application). \
 \
SuiteSparse_config is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "libsuitesparseconfig7-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "c0e2b72a5e6daabd4706a3f29fb37e16471d0c488bf9d3048c38cf757c74377b6fd2473c271aafbf5a532b2017c623dd0146355366921c58f5f205b2bc70384f"

RPROVIDES:${PN} += "libsuitesparseconfig.so.7 \
libsuitesparseconfig7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
