SUMMARY = "OSU MVAPICH3 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "mvapich4-ofi-doc-4.1-1.5.aarch64.rpm"
RPM_HASH = "3f8d1b89114fbd2a35115a0fd800ddd5bba8577057fa991824105cfdb06bfb30edfcefcd7dd6f5baa3d376d4deffe02609fdfc2d9977baa22f1581e81c9021b7"

RPROVIDES:${PN} += "mvapich4-ofi-doc"

RDEPENDS:${PN} += "mvapich4-ofi"

inherit rpm
