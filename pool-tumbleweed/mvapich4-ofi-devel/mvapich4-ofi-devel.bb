SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ofi-devel-4.1-1.5.aarch64.rpm"
RPM_HASH = "5e20996a0b1468694223c0bcec1061cb1250d7f3fab83215a863359687fd647a8af7e245191754263e3b2b1b4c883965698dd74bdcdbecb5ec5ebdc4188dc4ec"

RPROVIDES:${PN} += "mvapich4-ofi-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
mvapich4-ofi"

inherit rpm
