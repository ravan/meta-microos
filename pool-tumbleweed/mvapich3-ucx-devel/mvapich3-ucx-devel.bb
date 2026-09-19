SUMMARY = "OSU MVAPICH3 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ucx-devel-3.0-5.5.aarch64.rpm"
RPM_HASH = "1db48d39c55cd308233851cfcaa4a830c579d8c6282391248a7c78aa319c3e273b86df90ed1e3f784a0394b7ead7197897b549bcea6c98d7dd4447929bcc1df7"

RPROVIDES:${PN} += "mvapich3-ucx-devel"

RDEPENDS:${PN} += "gcc-c++ \
gcc-fortran \
mvapich3-ucx"

inherit rpm
