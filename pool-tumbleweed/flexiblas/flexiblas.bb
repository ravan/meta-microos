SUMMARY = "A BLAS/LAPACK wrapper library with runtime exchangeable backends"
DESCRIPTION = "FlexiBLAS is a wrapper library that enables the exchange of the BLAS and LAPACK \
implementation used by a program without recompiling or relinking it."
LICENSE = "LGPL-3.0 & BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "flexiblas-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "37af840907f74dbf2a3068c1834d345fd14a01605657f32ff716cfca4f61f513c755681bc3e7bbf282ed5ec33f1de790403ded395e188beef5be8256590b040b"

RPROVIDES:${PN} += "config-flexiblas \
flexiblas \
libflexiblas-api.so.3 \
libflexiblas-fallback-lapack.so \
libflexiblas-hook-dummy.so \
libflexiblas-hook-profile.so \
libflexiblas-mgmt.so.3 \
libflexiblas.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmvec.so.1"

inherit rpm
