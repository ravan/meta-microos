SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-openmpi4-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "d50814edd195fbbe8b267130a66ab7f79fb45de29bd8c40876054476f86fd2cf23f5b2a73aa1288172619cc9a70e9fb65f6470d24a8f523401b75b131ee1b391"

RPROVIDES:${PN} += "mpiP-openmpi4-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
