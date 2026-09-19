SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_cpp310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "06faadd0ab766510828535c76f0bf426eaf399535bf630a4ac198802b7b144df9d1084c88446bee2b008733b402db1af83129ccdcd628363f907be8d6e8b4364"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi5 \
libhdf5-hl-cpp.so.310 \
libhdf5-hl-cpp310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libstdc++.so.6"

inherit rpm
