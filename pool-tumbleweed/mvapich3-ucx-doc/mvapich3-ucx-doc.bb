SUMMARY = "OSU MVAPICH3 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH3 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "mvapich3-ucx-doc-3.0-5.5.aarch64.rpm"
RPM_HASH = "0c68b299586f9725277189052f256107178d6da87a9865f833af77b79aa5b49390f6268fc017065bb5974236253a97c2db127d126419354a257bd7d971a4203d"

RPROVIDES:${PN} += "mvapich3-ucx-doc"

RDEPENDS:${PN} += "mvapich3-ucx"

inherit rpm
