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

RPM_NAME = "mpiP-openmpi4-3.5-10.4.aarch64.rpm"
RPM_HASH = "2ef99c8699f543653bd77f78d018f2a1564ca9157371d99e61214c179551d02e51549d8e6e28acb7cab517cb5e7a5a1c7693b6bb99ef35552e286862056a342e"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-openmpi4"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libunwind.so.8 \
openmpi4"

inherit rpm
