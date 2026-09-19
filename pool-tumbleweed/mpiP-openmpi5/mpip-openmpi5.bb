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

RPM_NAME = "mpiP-openmpi5-3.5-10.4.aarch64.rpm"
RPM_HASH = "132030e305db7e7a90382cdade8ee148333d72d78bdcb800e9a332950afe93686bdee857cd9c33808623dd0b9b16dff18116b02c53bf9f761c29c8ae35a1b711"

RPROVIDES:${PN} += "libmpiP.so \
mpiP-openmpi5"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libunwind.so.8 \
openmpi5"

inherit rpm
