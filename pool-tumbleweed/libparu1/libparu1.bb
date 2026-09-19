SUMMARY = "Multifrontal sparse LU factorization methods"
DESCRIPTION = "ParU is an implementation of the multifrontal sparse LU factorization method. \
Parallelis is exploited both in the BLAS and across different frontal matrices \
using OpenMP tasking and shared-memory programming model for modern multicore \
architectures. \
 \
ParU is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-3.0-only"

PV = "7.14.0"

RPM_NAME = "libparu1-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "fb85ad77fe8481561b68c29afe10f79f93bf83bc0535ab7a629a8bb28b7057c0d065ded6492b1de0de87d200a1c48d323be50783e0e562df93b1348fccb7da48"

RPROVIDES:${PN} += "libparu.so.1 \
libparu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
libsuitesparseconfig.so.7 \
libumfpack.so.6"

inherit rpm
