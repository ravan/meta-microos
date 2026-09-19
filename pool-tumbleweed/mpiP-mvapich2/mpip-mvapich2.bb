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

RPM_NAME = "mpiP-mvapich2-3.5-10.4.aarch64.rpm"
RPM_HASH = "e0ef9c89056df3430f4944aaddc2c82c1cb05984a1c98e16b0bbdca5cc53bbf7fbdd6c8ad508673ffe4e95df9eb7b8a05248ec179d63fb6127842796d0d43b3e"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-mvapich2"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libunwind.so.8 \
mvapich2"

inherit rpm
