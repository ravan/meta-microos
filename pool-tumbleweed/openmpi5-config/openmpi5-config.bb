SUMMARY = "Runtime configuration files for openMPI version 5.0.10"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-config-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "a6533ccb4a2b0203720da2807d64e7db867ca7ba8441296675500492c02d6587547e0332b2184d6f63e1f8d9c0dff01607ae01ed97f630bdca76be9d2ad3cc88"

RPROVIDES:${PN} += "config-openmpi5-config \
openmpi-runtime-config \
openmpi5-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
