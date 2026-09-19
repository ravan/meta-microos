SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_cpp310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "890f3c133e92b98decb25b8c1062a4beed267f263b84046e3d3d4a1de6a1d82987e427bbed7bcff570e9b36f12bcc39d9a73c992bcfc2f602b68b6d501ff84b0"

RPROVIDES:${PN} += "libhdf5-cpp \
libhdf5-cpp.so.310 \
libhdf5-cpp310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libstdc++.so.6"

inherit rpm
