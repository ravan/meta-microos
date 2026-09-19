SUMMARY = "Multifrontal Sparse QR"
DESCRIPTION = "SuiteSparseQR is an implementation of the multifrontal sparse QR \
factorization method. Parallelism is exploited both in the BLAS and \
across different frontal matrices using Intel's Threading Building \
Blocks, a shared-memory programming model for modern multicore \
architectures. It can obtain a substantial fraction of the \
theoretical peak performance of a multicore computer. The package is \
written in C++ with user interfaces for MATLAB, C, and C++. \
 \
SuiteSparseQR is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "7.14.0"

RPM_NAME = "libspqr4-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "4bd8ac36d5ada3645015c3d55bcb99a62b22b3b4920433a3fe4bd442d37aaef294a3ea43e0c7ebca71169c5c899029914a0d193669a8cc2722e99a430b4a8a3b"

RPROVIDES:${PN} += "libspqr.so.4 \
libspqr4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcholmod.so.5 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libsuitesparseconfig.so.7"

inherit rpm
