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

RPM_NAME = "mpich-5.0.1-1.3.aarch64.rpm"
RPM_HASH = "7027d129f5a67cd4da5054db11e598bdc8670623b243846b2909de916f05deaf25268a538db3302e6aca5170f02aaa3202c6b6b3c6099fbe50d335918c9e1a37"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mpi \
mpich"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhwloc.so.15 \
libjson-c.so.5 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
mpi-selector"

inherit rpm
