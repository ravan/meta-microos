SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "889d4967c63412a2a2f05dbd2f7365ed25362c4bf1e515a23d9537b74af29e56a607b793729b264ca40c5599d321c964cff04c3d6788637d61aee8961f76bf2e"

RPROVIDES:${PN} += "hdf5"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-310 \
libhdf5-cpp310 \
libhdf5-fortran310 \
libhdf5-hl-cpp310 \
libhdf5-hl-fortran310 \
libhdf5-hl.so.310 \
libhdf5-hl310 \
libhdf5-tools.so.310 \
libhdf5-tools310 \
libhdf5.so.310"

inherit rpm
