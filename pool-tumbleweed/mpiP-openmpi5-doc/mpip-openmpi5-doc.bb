SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi5-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "c18afa6ee44e300effcb5e253da8677dd009adb763ff09a08b7d33513f431dfeecd328c5364cf923ab71e6fc9986635072cdd4a243d6a3cfd71948dc0474affa"

RPROVIDES:${PN} += "mpiP-openmpi5-doc"

RDEPENDS:${PN} += ""

inherit rpm
