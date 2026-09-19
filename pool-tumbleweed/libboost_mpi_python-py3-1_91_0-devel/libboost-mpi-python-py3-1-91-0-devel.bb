SUMMARY = "Development library for Boost.MPI Python 3.x serialization"
DESCRIPTION = "This package contains the Boost.MPI development library for Python 3.x \
serialization interface"
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_mpi_python-py3-1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "7fbed067884a92ce3439e68bbbf511f6b1d0c213b22fe10f3dc9c46f182c130150909f48152e83f54356150e977fe6866ec7b930a0d72f270416c8a9ff338d5f"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-91-0-devel \
libboost-mpi-python3-devel-impl"

RDEPENDS:${PN} += "libboost-mpi-python-py3-1-91-0 \
libboost-mpi1-91-0-devel \
libboost-python-py3-1-91-0"

inherit rpm
