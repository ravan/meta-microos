SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi5 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-openmpi5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "1a0da82782ccf9c3e3c6287e7261026e7b2afd9426bf9508d446b598b70c8ddd5e1f420c3e9e32cd1130397520589528008d1f0a65d97586906b7ef92552958f"

RPROVIDES:${PN} += "hdf5-openmpi5"

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
