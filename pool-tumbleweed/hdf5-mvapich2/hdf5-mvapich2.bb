SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-mvapich2-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "4910409266d78964015db6f650c4ade64a114c72c2fb904abaaa51ce694eb6d6c613a9a0390da9015b8d32979d0b562d1a14e692c3ef8809e807d4743a219676"

RPROVIDES:${PN} += "hdf5-mvapich2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310 \
libhdf5-fortran310 \
libhdf5-hl-fortran310 \
libhdf5-hl.so.310 \
libhdf5-hl310 \
libhdf5-tools.so.310 \
libhdf5-tools310 \
libhdf5.so.310 \
libm.so.6 \
libmpi.so.12"

inherit rpm
