SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ucx-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "086003630166a84517c04721857d6d29c357af567255412bc8f85148b902e4f4492880a8506a566eb31bddd45a23fc2b71bf9579163a637fc4ae143a5561dc47"

RPROVIDES:${PN} += "mpiP-mvapich3-ucx-devel"

RDEPENDS:${PN} += ""

inherit rpm
