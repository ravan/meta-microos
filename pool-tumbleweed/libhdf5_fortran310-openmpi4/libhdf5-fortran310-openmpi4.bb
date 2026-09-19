SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_fortran310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "0f7c9b6f56a3e11b61652296eb5c1207efd5f4006a0b56170c646b0216419f6b2a368213c8b7d759f4ca55bf2b0cfaaf7b843e7a189b9421e65eb549018423de"

RPROVIDES:${PN} += "libhdf5-f90cstub.so.310 \
libhdf5-fortran-openmpi4 \
libhdf5-fortran.so.310 \
libhdf5-fortran310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5.so.310 \
libmpi.so.40"

inherit rpm
