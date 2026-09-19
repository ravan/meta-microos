SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_fortran310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "563e8ad0fbb8ef53501049218758a60312e1e9e256752e49329647932fab050f7e55c28efd0bec2c01d12fe3078de4ab6cbb588e29bff845630b70b6dc391236"

RPROVIDES:${PN} += "libhdf5-hl-f90cstub.so.310 \
libhdf5-hl-fortran-mvapich2 \
libhdf5-hl-fortran.so.310 \
libhdf5-hl-fortran310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-f90cstub.so.310 \
libhdf5-fortran.so.310 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libmpi.so.12"

inherit rpm
