SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-2.3.7-12.6.aarch64.rpm"
RPM_HASH = "0b907fecf334cd25b0a17c6a4225b2e1f0ba4c03778c7827d2b12110eafcb2747b8b4734361bf0c6eb71da44aff4eceadf95e4e34fb08969b141226b2c6211c9"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mvapich2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libibmad.so.5 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libnuma.so.1 \
libpciaccess.so.0 \
librdmacm.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
mpi-selector"

inherit rpm
