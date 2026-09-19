SUMMARY = "Shared memory parallel sparse matrix and sparse BLAS library"
DESCRIPTION = "librsb is a library for sparse matrix computations featuring the \
Recursive Sparse Blocks (RSB) matrix format. This format allows cache \
efficient and multi-threaded (that is, shared memory parallel) \
operations on large sparse matrices. \
 \
librsb implements the Sparse BLAS standard, as specified in the BLAS \
Forum documents."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.0.3"

RPM_NAME = "librsb0-1.3.0.3-1.3.aarch64.rpm"
RPM_HASH = "4de7b25942a121291760ec790fef81e585ea83bc4f73cfd5f6b337a84bb3534f63a43d369df856322493b9b443376d0695df9518e64278b980e5652aec8b8b90"

RPROVIDES:${PN} += "librsb.so.0 \
librsb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
