SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi4-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "1ce35538209bdc085fe7b71008e2492cb50b08ad017da9bd51f29b603802a03c7d2dbb3d72bbb48ddda7ff6bcd1376658eb97a1cc3eb5e4d3c6c5af9474a56a3"

RPROVIDES:${PN} += "mpiP-openmpi4-devel"

RDEPENDS:${PN} += ""

inherit rpm
