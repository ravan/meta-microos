SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich2-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "02b5bf2a6e438d57c9ce276f2474933468f51447014edc900e4681dfb476ee86feedae2ca29f5d43a9ded1dff0d930ebe0b7c463a0e43a8947167939ad1589f2"

RPROVIDES:${PN} += "mpiP-mvapich2-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
