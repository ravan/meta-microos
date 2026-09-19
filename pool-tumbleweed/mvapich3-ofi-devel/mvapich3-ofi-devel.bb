SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ofi-devel-3.0-5.5.aarch64.rpm"
RPM_HASH = "3734ca568b70557c124548b60fab52d33d9ac01d9cff8ef4564c9d71e7581a46dbd782ca77d1b9ed3e23c997c0da7acf1476a99ab8f666ec73d37beaf00ec4c4"

RPROVIDES:${PN} += "mvapich3-ofi-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
mvapich3-ofi"

inherit rpm
