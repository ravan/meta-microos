SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi5 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5-310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "cc59eef73155c9808e11923815f137490475871267b4045c58f854b212f23d2834950634edb25b0d8c89060ffd6b3eb6582331e253677f951e8f22d0e911a73a"

RPROVIDES:${PN} += "libhdf5-310-openmpi5 \
libhdf5-openmpi5 \
libhdf5.so.310"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
