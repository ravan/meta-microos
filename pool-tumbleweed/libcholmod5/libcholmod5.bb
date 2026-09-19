SUMMARY = "Supernodal Sparse Cholesky Factorization and Update/Downdate"
DESCRIPTION = "CHOLMOD is a set of ANSI C routines for sparse Cholesky factorization \
and update/downdate. A MATLAB interface is provided. \
 \
The performance of CHOLMOD was compared with 10 other codes in a \
paper by Nick Gould, Yifan Hu, and Jennifer Scott. see also their raw \
data. Comparing BCSLIB-EXT, CHOLMOD, MA57, MUMPS, Oblio, PARDISO, \
SPOOLES, SPRSBLKLLT, TAUCS, UMFPACK, and WSMP, on 87 large symmetric \
positive definite matrices, they found CHOLMOD to be fastest for 42 \
of the 87 matrices. Its run time is either fastest or within 10% of \
the fastest for 73 out of 87 matrices. Considering just the larger \
matrices, it is either the fastest or within 10% of the fastest for \
40 out of 42 matrices. It uses the least amount of memory (or within \
10% of the least) for 35 of the 42 larger matrices. Jennifer Scott \
and Yifan Hu also discuss the design considerations for a sparse \
direct code. \
 \
CHOLMOD is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "7.14.0"

RPM_NAME = "libcholmod5-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "63e334150594eb281868747e9b2a3bde8cb447c4351c1c78f4a1e35c24e3c68eed0ccf4aa94220bc0538fb6e633ba521908d94e5fb7d43b85bdfdecafedcfbac"

RPROVIDES:${PN} += "libcholmod.so.5 \
libcholmod5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libamd.so.3 \
libc.so.6 \
libcamd.so.3 \
libccolamd.so.3 \
libcolamd.so.3 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libsuitesparseconfig.so.7"

inherit rpm
