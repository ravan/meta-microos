SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features. It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ucx-3.0-5.5.aarch64.rpm"
RPM_HASH = "4c88b18f50ad7a9315c5a98eb519fe0de2d735eeea2e5305ec47f9b54a59c17383ba262216c970f70b2e8e0f2564147e05d0e3e2f1ad41b4316ceed554ab8860"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mvapich3-ucx"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libpciaccess.so.0 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
libxml2.so.16 \
mpi-selector"

inherit rpm
