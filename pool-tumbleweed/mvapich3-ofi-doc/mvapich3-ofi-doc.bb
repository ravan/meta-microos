SUMMARY = "OSU MVAPICH3 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ofi-doc-3.0-5.5.aarch64.rpm"
RPM_HASH = "52f78fbd5baf201c48bf4369916ec710cb0ea8a27c81adf525084cd43a564e24f29f15dc447366368b7747c949d5edb2cfcf066baae5d7b928b6101d9868fb47"

RPROVIDES:${PN} += "mvapich3-ofi-doc"

RDEPENDS:${PN} += "mvapich3-ofi"

inherit rpm
