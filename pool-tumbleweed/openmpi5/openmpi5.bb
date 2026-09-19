SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
 \
 \
 \
OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
OpenMPI also includes an implementation of the OpenSHMEM parallel \
programming API, which is a Partitioned Global Address Space (PGAS) \
abstraction layer providing inter-process communication using \
one-sided communication techniques. \
 \
This package provides general tools (mpirun, mpiexec, etc.) and the \
Module Component Architecture (MCA) base and plugins necessary for \
running Open MPI/OpenSHMEM version 5.0.10 jobs."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "697af9edb380a4a29244cea0d9a18dccc706c92f53943c2489225acbda3f2ae1461e8b78e44d9c71cdcf3c3345d31c63c8c20eb0cf80315d28392400407b33f1"

RPROVIDES:${PN} += "mpi \
openmpi \
openmpi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libhwloc.so.15 \
libmpi.so.40 \
libopen-pal.so.80 \
liboshmem.so.40 \
libprrte.so.3 \
mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
