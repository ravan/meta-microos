SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features. It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ofi-3.0-5.5.aarch64.rpm"
RPM_HASH = "65d1041ae297da661dd52b5b7b01f356f1bb2b84eaa492b0f0552671d1bdef2e8ea7279475244b96c570a39b4d1e71bb2df9cd9f88bcb8b5e8491e739aa8cd5d"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mvapich3-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgcc-s.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libpciaccess.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
mpi-selector"

inherit rpm
