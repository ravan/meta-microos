SUMMARY = "Linear Algebra PACKage - static libraries"
DESCRIPTION = "LAPACK provides routines for solving systems of simultaneous linear \
equations, least-squares solutions of linear systems of equations, \
eigenvalue problems, and singular value problems. The associated matrix \
factorizations (LU, Cholesky, QR, SVD, Schur, generalized Schur) are \
also provided, as are related computations such as reordering of the \
Schur factorizations and estimating condition numbers. Dense and banded \
matrices are handled, but not general sparse matrices. In all areas, \
similar functionality is provided for real and complex matrices, in \
both single and double precision. \
 \
This package provides the static library for LAPACK."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "lapack-devel-static-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "86709b9c6652f4b3b8146c5816c590e2e49bd70edd8e206b1704faf36a2d4496e08986f6a277486e6730708b877890e57310162d74a3accfe95b4235463cdd0c"

RPROVIDES:${PN} += "lapack-devel-static"

RDEPENDS:${PN} += "lapack-devel"

inherit rpm
