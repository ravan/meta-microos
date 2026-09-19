SUMMARY = "SDK for openMPI version 5.0.10"
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
This package provides the development files for Open MPI/OpenSHMEM \
version 5.0.10, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-devel-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "01b1f8afc6a2c3c592b1cb7ec31cd4ecd3df13f66feb5ce88860722bdff37a38af08650f7e317f58de7587d0d35d2c88225530cd9e4d3c3ba11c1fc5531ce2f6"

RPROVIDES:${PN} += "openmpi-devel \
openmpi5-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libstdc++-devel \
openmpi5"

inherit rpm
