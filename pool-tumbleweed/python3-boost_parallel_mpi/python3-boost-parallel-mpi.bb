SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "python3-boost_parallel_mpi-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "30b82e1afa1a4100daf69c13c05cce2a4a3e4460712e3f641df7823f6841aad66155bb5fd65c7fc37ae180d5e501234b9c95e42a44c7549f92029b7d7de9b13c"

RPROVIDES:${PN} += "python3-boost-parallel-mpi"

RDEPENDS:${PN} += "python3-boost-parallel-mpi1-91-0"

inherit rpm
