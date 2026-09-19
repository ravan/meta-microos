SUMMARY = "A profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
It only collects statistical information about MPI functions, so mpiP \
generates less overhead and much less data than tracing \
tools. All the information captured by mpiP is task-local. It only \
uses communication during report generation, typically at the end of \
the experiment, to merge results from all of the tasks into one output \
file."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ofi-3.5-10.4.aarch64.rpm"
RPM_HASH = "22bfa03478d95d21d0d77e9a92409e09c951e629e945dc9d81f345b70577cd00b0246a86a4a8244eaee75ca8a70797f1f56a2b1e772644a7dc39fd19f555edfe"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-mvapich3-ofi"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libunwind.so.8 \
mvapich3-ofi"

inherit rpm
