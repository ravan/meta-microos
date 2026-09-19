SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_tools310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "f6c729c8570cd78f4f3445a727a76b52212068d3182d35ebb539f0c2c68c91a7a386f8dfddb53778a67bc355c17744c277010308f4d734d32cfa46d91a8c91c1"

RPROVIDES:${PN} += "libhdf5-tools \
libhdf5-tools.so.310 \
libhdf5-tools310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310"

inherit rpm
