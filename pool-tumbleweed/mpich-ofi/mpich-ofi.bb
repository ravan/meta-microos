SUMMARY = "High-performance and widely portable implementation of MPI"
DESCRIPTION = "MPICH is a high performance and widely portable implementation of the Message \
Passing Interface (MPI) standard. \
 \
The goals of MPICH are: \
 \
 * to provide an MPI implementation that efficiently supports different \
   computation and communication platforms including commodity clusters \
   (desktop systems, shared-memory systems, multicore architectures), \
   high-speed networks and proprietary high-end computing systems \
   (Blue Gene, Cray) \
 * to enable cutting-edge research in MPI through an easy-to-extend modular \
   framework for other derived implementations"
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "mpich-ofi-5.0.1-1.3.aarch64.rpm"
RPM_HASH = "9b516560ea43816d93a9da6eb6f365a6cd467f2767b20526e7015b576e11fd5478fde1c1107a76bda438b3caacc56b25934126796e25c42a6fc765435c80f228"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mpi \
mpich-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libhwloc.so.15 \
libjson-c.so.5 \
libstdc++.so.6 \
mpi-selector"

inherit rpm
