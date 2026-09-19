SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 5.0.10"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
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
This package provides the Open MPI/OpenSHMEM version 5.0.10 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-libs-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "8347f1dbf87416212fed9aec998140a7bf2e64b880df6b852f475874490681162687c2cdcca7113943a08cdd867d8859e025b6289287b01ebd19515a22b4ca16"

RPROVIDES:${PN} += "libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libompi-dbg-msgq.so \
libopen-pal.so.80 \
liboshmem.so.40 \
libprrte.so.3 \
openmpi-libs \
openmpi5-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libm.so.6 \
libucm.so.0 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
libz.so.1 \
openmpi5"

inherit rpm
