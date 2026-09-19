SUMMARY = "Linear Algebra PACKage: Shared Library"
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
This package provides the shared library for LAPACK."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "liblapack3-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "39ce23a097c7520426d4a54084020f3dbfdf3ee9f350c3be87f3fce3d4f82c842a8b65730805f63871f533069a82a938de91d3586cfc2900f95261d94f54bb84"

RPROVIDES:${PN} += "liblapack.so.3 \
liblapack3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmvec.so.1 \
update-alternatives"

inherit rpm
