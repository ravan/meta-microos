SUMMARY = "Documentation for Open MPI/SHMEM version 5.0.10"
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

PV = "5.0.10"

RPM_NAME = "openmpi5-docs-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "f4bcd5e00c4207180b458f565b54860f1e5227130f0ea61d948e1662bfcdf3a77e1ed4a260d5e0d6cefbd62ca653a1010622a121c448352b341e0ad87be07d1f"

RPROVIDES:${PN} += "openmpi5-docs"

RDEPENDS:${PN} += "openmpi5"

inherit rpm
