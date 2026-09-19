SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_cpp310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "49e4fe741e5edb4a8daf4ada50c0dc29a0e83ebaf92a3002e02b39b0bfd87dcb2146766fcbd652e980ac6cd3d30e521e2e3326801eccd87cc90bc1c71ee63e16"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi4 \
libhdf5-hl-cpp.so.310 \
libhdf5-hl-cpp310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libstdc++.so.6"

inherit rpm
