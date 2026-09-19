SUMMARY = "Development files for hdf5-openmpi5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi5 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-openmpi5-devel-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "5f503be3d6906b8c7cf967381a5d1d3ce1388d0edece7fe6dfe1964b0f72200d6cbc7f207c2dbdbe814cec7548d33b2bbf5d7ce213ae2dfb6bcf3228f7bf9986"

RPROVIDES:${PN} += "hdf5-openmpi5-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-openmpi5 \
libhdf5-310-openmpi5 \
libhdf5-cpp310-openmpi5 \
libhdf5-fortran310-openmpi5 \
libhdf5-hl-cpp310-openmpi5 \
libhdf5-hl-fortran310-openmpi5 \
libhdf5-hl310-openmpi5 \
libhdf5-tools310-openmpi5 \
zlib-devel"

inherit rpm
