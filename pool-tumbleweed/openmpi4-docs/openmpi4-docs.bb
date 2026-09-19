SUMMARY = "Documentation for Open MPI/SHMEM version 4.1.8"
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
This subpackage provides the documentation for Open MPI/OpenSHMEM."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-docs-4.1.8-4.7.aarch64.rpm"
RPM_HASH = "b2a88aa630f5edd191ea3c4dbe34d7d58f6982f6ec3655ad02f4d89780d385777fdefd5da77eb2dea0bb40d85c0af6ab92fd936d8eabb5d3dc36857d9cebed9c"

RPROVIDES:${PN} += "openmpi4-docs"

RDEPENDS:${PN} += "openmpi4"

inherit rpm
