SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ofi-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "965b7f5c906b6d9e17726612b70bccf181a5e882d990547d274e36d00e9a38a79f6f8132cf9c99fb8184850218822b13fee8b9e5227cd706acddd636d35a2acf"

RPROVIDES:${PN} += "mpiP-mvapich3-ofi-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
