SUMMARY = "OSU MVAPICH4 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features. It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ucx-4.1-1.4.aarch64.rpm"
RPM_HASH = "9883b980730c0c1dda53b867c5fb54020dce4c95311a4f8fb1db939d23325b2cff1d8867718885bb948f6bccee2bf98a57794043178159575ee7fc2683352580"

RPROVIDES:${PN} += "libmpi.so.0 \
libmpicxx.so.0 \
libmpifort.so.0 \
mvapich4-ucx"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhwloc.so.15 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
mpi-selector"

inherit rpm
