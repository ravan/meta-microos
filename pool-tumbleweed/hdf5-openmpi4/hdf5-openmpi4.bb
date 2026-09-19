SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-openmpi4-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "108398d4977f86a96230cbda51eb8e664cf7b444d9ec7e00cd3c83fe71e2266cfbc99a3c481b0fa60688291c308ceebc64298279de641e3c1849c1b6138c8b2d"

RPROVIDES:${PN} += "hdf5-openmpi4"

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
libmpi.so.40"

inherit rpm
