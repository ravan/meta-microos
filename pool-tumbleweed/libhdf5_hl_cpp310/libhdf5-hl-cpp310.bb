SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_cpp310-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "d1984189fbc16f4ddd9f8cd958d9fa9794d23a7cd541c796a4574c08937e5fd8d704eb5b95cac62e0daa0787de2677fd7873e6d979592dcf6034cae38878c35a"

RPROVIDES:${PN} += "libhdf5-hl-cpp \
libhdf5-hl-cpp.so.310 \
libhdf5-hl-cpp310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libstdc++.so.6"

inherit rpm
