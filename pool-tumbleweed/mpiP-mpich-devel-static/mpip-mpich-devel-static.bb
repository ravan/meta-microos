SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mpich-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "790b73b97430bef53e4ad152a1a280db394c3a0b8fbc05b371754f33e3a8720a77522c71345452432c55883e26a11de75f3a92408ffdc5184b8c54baa0456796"

RPROVIDES:${PN} += "mpiP-mpich-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
