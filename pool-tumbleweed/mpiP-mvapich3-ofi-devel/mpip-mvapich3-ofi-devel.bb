SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ofi-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "f3dfd0e30d39067c6f1af12a18659ac7e0075f26acec05c96910a9eeb8225f5bcabd8b574e40cb30455423849eef4958a9ef7b5dca6b4c95a7b3311bbc1ec996"

RPROVIDES:${PN} += "mpiP-mvapich3-ofi-devel"

RDEPENDS:${PN} += ""

inherit rpm
