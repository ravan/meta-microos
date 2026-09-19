SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi5 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_fortran310-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "33e0908a758f11a62a9b4b8c06fe5f27f889384aa5e920872e9fb2f97fe99962f8d7d2d28f1cc94e6d681d612d00e0015d70fec1498d176290739c8c0467d057"

RPROVIDES:${PN} += "libhdf5-f90cstub.so.310 \
libhdf5-fortran-openmpi5 \
libhdf5-fortran.so.310 \
libhdf5-fortran310-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5.so.310 \
libmpi.so.40"

inherit rpm
