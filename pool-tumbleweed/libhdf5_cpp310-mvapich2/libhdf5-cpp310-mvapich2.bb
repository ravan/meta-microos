SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_cpp310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "a70042217cf3f257059d70f56b82f093fe2e01cb1659ec4a688fc953b29d7e7f5223c4889333bbd03ec792b2781e2850167ea5b00af1a51b4e7fd5ab08d507cb"

RPROVIDES:${PN} += "libhdf5-cpp-mvapich2 \
libhdf5-cpp.so.310 \
libhdf5-cpp310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
