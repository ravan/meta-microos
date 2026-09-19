SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_cpp310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "1bf435a55d0e51d4e0bca2813857fd8123530483d60584462a903f5c578e8ec09532ce283bc87dd61b1524e6d0ee916b92b15b43ebd0e9d1cb86f3e733ae642f"

RPROVIDES:${PN} += "libhdf5-hl-cpp-mvapich2 \
libhdf5-hl-cpp.so.310 \
libhdf5-hl-cpp310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libstdc++.so.6"

inherit rpm
