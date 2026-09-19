SUMMARY = "Development files for librsb, a Recursive Sparse Blocks matrix format lirary"
DESCRIPTION = "librsb is a library for sparse matrix computations featuring the \
Recursive Sparse Blocks (RSB) matrix format. This format allows cache \
efficient and multi-threaded (that is, shared memory parallel) \
operations on large sparse matrices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librsb."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.0.3"

RPM_NAME = "librsb-devel-1.3.0.3-1.3.aarch64.rpm"
RPM_HASH = "8a37d746f34f9190281f0c99517f30ee5fb71d5dafa778e84c9b21a02319b3597acd90d4348b97475acfd1a608ae562602aa910e7f37d5efc288fa163888c5d4"

RPROVIDES:${PN} += "librsb-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
librsb.so.0 \
librsb0 \
libstdc++.so.6"

inherit rpm
