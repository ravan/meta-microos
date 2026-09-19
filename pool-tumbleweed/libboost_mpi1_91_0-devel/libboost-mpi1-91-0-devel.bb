SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library"
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_mpi1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "6a75cf2ceb467cc002961f4271b96398d1ebefa4e9858eda3efaf3290da20084e5b5b6c4e3e62986de0bccf3e7bdd16fe2c39d8bca9508a58c7d5ed194dea872"

RPROVIDES:${PN} += "libboost-mpi-devel-impl \
libboost-mpi1-91-0-devel"

RDEPENDS:${PN} += "libboost-graph1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-mpi1-91-0 \
libboost-python-py3-1-91-0-devel \
libboost-serialization1-91-0-devel \
openmpi5-devel"

inherit rpm
