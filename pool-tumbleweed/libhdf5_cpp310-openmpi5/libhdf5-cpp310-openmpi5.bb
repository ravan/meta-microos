SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_cpp310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "7f91dbda7db402b6dae9898976a9060196089f2616cb787daef0aedef586e2bea220a0a8ed755735979e6f05d2793ed820156fb90710eaa08d2e1619c6f1989b"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi5 \
libhdf5-cpp.so.310 \
libhdf5-cpp310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libstdc++.so.6"

inherit rpm
