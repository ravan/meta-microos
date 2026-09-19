SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
interface."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_mpi_python-py3-1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "b3561044ecde3b12ce2a9ad2c7b9618c537afe2818430bba7705bd5c2704e9e5cce8466db2584f8230e7d04899eed3cb6d72d36c62e4470445ae57764741c10f"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-91-0 \
libboost-mpi-python-py3.so.1.91.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
