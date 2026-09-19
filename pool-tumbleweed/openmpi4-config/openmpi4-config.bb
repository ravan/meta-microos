SUMMARY = "Runtime configuration files for openMPI version 4.1.8"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-config-4.1.8-4.7.aarch64.rpm"
RPM_HASH = "c44ce869568e5889042246e3a9bcd5df364265069c3fb4165dc11d2457431230203a2d05539bb2b711dfec3ac764e02503e4a37f3cf88312376fb7211a34d730"

RPROVIDES:${PN} += "config-openmpi4-config \
openmpi-runtime-config \
openmpi4-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
