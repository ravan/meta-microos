SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi5-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "1d6a0a1f2d238cfd68ab2dfa13f420488239762bd2c15e598177de13edf731b2397827fb6b622a9e0fc01e4533a7c9765b4c4567b0f41185da0aacae2da5c03a"

RPROVIDES:${PN} += "mpiP-openmpi5-devel"

RDEPENDS:${PN} += ""

inherit rpm
