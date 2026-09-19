SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ucx-devel-static-3.5-10.4.aarch64.rpm"
RPM_HASH = "10c167202ee7177e1922820ff95481ca8c73596a543c1f66d511811c3a8275a9e20018c2705190a0b3abc7e06e75b1beba085ed21e8eae563fedd33d53e4a0ca"

RPROVIDES:${PN} += "mpiP-mvapich3-ucx-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
