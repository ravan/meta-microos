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

RPM_NAME = "mpiP-mpich-3.5-10.4.aarch64.rpm"
RPM_HASH = "d94f72bf9d21fd7f7bdb9ac7aff9b1ec3b61801bc7ab37eb226086129d7d46eeb7fc44aba93754c7690c0fc0177ccfb171b2f2b90e5f966dd9e57e033c8dfa77"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-mpich"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libunwind.so.8 \
mpich"

inherit rpm
