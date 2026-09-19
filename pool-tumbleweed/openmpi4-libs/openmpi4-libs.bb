SUMMARY = "OpenMPI runtime libraries for OpenMPI version 4.1.8"
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
This package provides the Open MPI/OpenSHMEM version 4.1.8 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-libs-4.1.8-4.7.aarch64.rpm"
RPM_HASH = "58a0096c3cf422cb5e37d494e55da6c05fdb74eff92e565374053438550675deaa8f307627e7dcc5c05f314a9040176b4dbc8ab3a13388cd2908dbf7d326eb6d"

RPROVIDES:${PN} += "libmca-common-dstore.so.1 \
libmca-common-monitoring.so.50 \
libmca-common-ofi.so.10 \
libmca-common-ompio.so.41 \
libmca-common-sm.so.40 \
libmca-common-ucx.so.40 \
libmca-common-verbs.so.40 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libompi-dbg-msgq.so \
libompitrace.so.40 \
libopen-pal.so.40 \
libopen-rte.so.40 \
liboshmem.so.40 \
openmpi4-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libfabric.so.1 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucm.so.0 \
libucp.so.0 \
libucs.so.0 \
openmpi4"

inherit rpm
