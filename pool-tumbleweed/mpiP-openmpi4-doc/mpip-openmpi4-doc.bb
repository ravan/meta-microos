SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi4-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "23201a9af52399b60e4d1bc6e985292b8930a521d110c189d6d5a4700338f4fa89d6084e6b3494a49a81905a56beec6e0915d26cb47a3319eb781f9e1715df0f"

RPROVIDES:${PN} += "mpiP-openmpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
