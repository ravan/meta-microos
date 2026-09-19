SUMMARY = "Sparse LU Factorization, for Circuit Simulation"
DESCRIPTION = "KLU is a sparse LU factorization algorithm well-suited for use in \
circuit simulation. It was highlighted in the May 2007 issue of SIAM \
News, Sparse Matrix Algorithm Drives SPICE Performance Gains. It is \
the 'fast sparse-matrix solver' mentioned in the article. \
 \
KLU is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libklu2-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "05de12ee364a75e2f064b2eeb061fa82f59b0e080498de32885b622d26aeb41eae63f488bcaa3d80a37f8c20b96e5f8fe0217587e8de181facce58ad3a2b0205"

RPROVIDES:${PN} += "libklu.so.2 \
libklu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libamd.so.3 \
libbtf.so.2 \
libc.so.6 \
libcolamd.so.3 \
libsuitesparseconfig.so.7"

inherit rpm
