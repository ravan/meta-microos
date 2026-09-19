SUMMARY = "Linear Algebra PACKage: headers and source files for development"
DESCRIPTION = "LAPACK provides routines for solving systems of simultaneous linear \
equations, least-squares solutions of linear systems of equations, \
eigenvalue problems, and singular value problems. The associated matrix \
factorizations (LU, Cholesky, QR, SVD, Schur, generalized Schur) are \
also provided, as are related computations such as reordering of the \
Schur factorizations and estimating condition numbers. Dense and banded \
matrices are handled, but not general sparse matrices. In all areas, \
similar functionality is provided for real and complex matrices, in \
both single and double precision."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "lapack-devel-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "0a66e05b2bec9e5d4a20e7b0be610ec5c8b10e6d7f6a437f0177bd6f9e5bb9f0be4a1cdfa4e5ec81b73ad4a29882ed7eff67d9fcf9ab596a818a424ceec80ff2"

RPROVIDES:${PN} += "cmake-lapack \
lapack \
lapack-devel \
pkgconfig-lapack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blas-devel \
liblapack3 \
pkgconfig-blas \
tmglib-devel"

inherit rpm
