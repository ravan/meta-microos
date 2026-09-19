SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ucx-devel-4.1-1.4.aarch64.rpm"
RPM_HASH = "b4636faf6770b0b1880fe54f7a8df9c635518ee9848d3cf6d9d0d03ae91057978adbecf70ef02cceeec9ad2e3df8f9e4abccb422e10d52c7b8c935dbd88d4a4c"

RPROVIDES:${PN} += "mvapich4-ucx-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
mvapich4-ucx"

inherit rpm
