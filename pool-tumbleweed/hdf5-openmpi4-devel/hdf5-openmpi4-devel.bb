SUMMARY = "Development files for hdf5-openmpi4"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-openmpi4-devel-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "aca6af9da105d36b7a0bae83e88c7538dacad416f072af732a594a3a87cb65b1e4f09f7f194f277bda3b0cb54cac1904c8dba0730a439629f6909e7264677f67"

RPROVIDES:${PN} += "hdf5-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi4 \
libhdf5-310-openmpi4 \
libhdf5-cpp310-openmpi4 \
libhdf5-fortran310-openmpi4 \
libhdf5-hl-cpp310-openmpi4 \
libhdf5-hl-fortran310-openmpi4 \
libhdf5-hl310-openmpi4 \
libhdf5-tools310-openmpi4 \
zlib-devel"

inherit rpm
