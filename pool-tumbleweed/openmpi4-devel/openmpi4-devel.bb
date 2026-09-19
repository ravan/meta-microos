SUMMARY = "SDK for openMPI version 4.1.8"
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
version 4.1.8, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-devel-4.1.8-4.7.aarch64.rpm"
RPM_HASH = "ad8124de3805f32c99abf245d4ca63fed7e5b993d44737f34f052f9865e5ac4c72580206f4766caaf36078b768f04343a3b7f298ce22e03165747a584fa03809"

RPROVIDES:${PN} += "openmpi4-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libmpi.so.40 \
libopen-pal.so.40 \
libstdc++-devel \
openmpi4"

inherit rpm
