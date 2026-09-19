SUMMARY = "OSU MVAPICH4 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features. It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ofi-4.1-1.5.aarch64.rpm"
RPM_HASH = "3735bf0898dc7211c207a41d8cb70288da617a93873ce920d66d9e38500b7a6b1fc5a5b9927511bf9a4661d837fdcb715a4f939c368eda85ea31cbe0ca59bded"

RPROVIDES:${PN} += "libmpi.so.0 \
libmpicxx.so.0 \
libmpifort.so.0 \
mvapich4-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libhwloc.so.15 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
mpi-selector"

inherit rpm
