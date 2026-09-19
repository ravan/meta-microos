SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "libhdf5_fortran310-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "3316dadf4a4379487ccb5aa903b3dcdbb6d2661dac02aabac4dd71e54d5fdbb0174911f37313a9ed36bc000a274c3066ea6b0a87cde212d3faa69d76f6c0fa53"

RPROVIDES:${PN} += "libhdf5-f90cstub.so.310 \
libhdf5-fortran-mvapich2 \
libhdf5-fortran.so.310 \
libhdf5-fortran310-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5.so.310 \
libmpi.so.12"

inherit rpm
