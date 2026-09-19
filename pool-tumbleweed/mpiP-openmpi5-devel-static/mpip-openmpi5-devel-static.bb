SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi5-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "dfa09693046b7dca6377f227d1363e988f569fd36eea7a944299f265d95ac58911726f3a15b17a50fa6074958eb9da87bc36b191ce51ba35c6fe87b4ff4e0f62"

RPROVIDES:${PN} += "mpiP-openmpi5-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
