SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x"
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "python3-boost_parallel_mpi1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "db907ea67ce4af8094acb78135b0e90225ea65552b3aa63d68cb41e3d2c8c96f54f0e0c697cea0479edc0e31e5eaba5f4e485cbe117d3041217b1f2ce0b74c12"

RPROVIDES:${PN} += "python3-boost-parallel-mpi-impl \
python3-boost-parallel-mpi1-91-0"

RDEPENDS:${PN} += "libboost-mpi-python-py3.so.1.91.0 \
libboost-mpi.so.1.91.0 \
libboost-python-py3.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
