SUMMARY = "Development library for Boost.MPI Python 3.x serialization"
DESCRIPTION = "This package contains the Boost.MPI development library for Python 3.x \
serialization interface \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_mpi_python3-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "8a41a4cda4eb461bcac16b50753327709d9ff6042f6edde30e5c7eb5bfa71b0a3ca32d06fdabe734015b18fbcadfe2a24e283d32e219cba4acc29ebcaf384d75"

RPROVIDES:${PN} += "libboost-mpi-python3-devel"

RDEPENDS:${PN} += "libboost-mpi-python-py3-1-91-0-devel"

inherit rpm
