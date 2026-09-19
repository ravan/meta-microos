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

RPM_NAME = "mpiP-mvapich3-ucx-3.5-10.4.aarch64.rpm"
RPM_HASH = "775ffb69f3fa12876b15b80ff5bd4dacba41041dd039babe3453a97ddd96c112b98a0878ba3a2470678e64edabadbcb17dba44bf6a5ad00633201a9baa8d8b63"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-mvapich3-ucx"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libunwind.so.8 \
mvapich3-ucx"

inherit rpm
