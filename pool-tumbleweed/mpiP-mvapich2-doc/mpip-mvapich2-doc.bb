SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich2-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "501568d041f84e447fc60a55518c8d5925b7237993c0de9be1c5e86c8a4a8db261ed627528fa16079fa2765f75e287714a1b1e48a2015739a02ab23e1c4f8b2c"

RPROVIDES:${PN} += "mpiP-mvapich2-doc"

RDEPENDS:${PN} += ""

inherit rpm
