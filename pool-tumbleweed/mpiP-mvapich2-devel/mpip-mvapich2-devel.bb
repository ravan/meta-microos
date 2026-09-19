SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich2-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "38bd136bb1edf2f4aaca45c52e9504e282c6271e41fb654e593a77461c1b80888091d5ba75a1e6faec73e50cf056bb2cee5f0a298af226a5551563ddfd4706e1"

RPROVIDES:${PN} += "mpiP-mvapich2-devel"

RDEPENDS:${PN} += ""

inherit rpm
