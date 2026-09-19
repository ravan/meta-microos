SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_hl_fortran310-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "9481b12cdd016a58c5c6aaf7aa26cc40d79c6a6cfde81796b8f53d483c6bec9387110883f8d69d9135e1fc01436974c90ba5891a5ed40d48eb64a39fd735bd5f"

RPROVIDES:${PN} += "libhdf5-hl-f90cstub.so.310 \
libhdf5-hl-fortran-openmpi4 \
libhdf5-hl-fortran.so.310 \
libhdf5-hl-fortran310-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-f90cstub.so.310 \
libhdf5-fortran.so.310 \
libhdf5-hl.so.310 \
libhdf5.so.310"

inherit rpm
