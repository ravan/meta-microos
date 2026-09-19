SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_cpp310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "f9578ce7243acdf2c31d072a44fd18d52e702e4cb7eaa335661e6d93b621759edec134b6cb5d9f62078c5fc60de6bb701edaf91b116d42a1c07887c8fbc9eefe"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi4 \
libhdf5-cpp.so.310 \
libhdf5-cpp310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libstdc++.so.6"

inherit rpm
