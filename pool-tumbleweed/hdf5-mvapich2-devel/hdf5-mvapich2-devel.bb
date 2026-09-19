SUMMARY = "Development files for hdf5-mvapich2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-mvapich2-devel-1.14.6-2.6.aarch64.rpm"
RPM_HASH = "957a4b0b2b176e4c86eca8c5233635e2f91a663e87db56346c96aabc209334fd57bdee66dcf97914de13bb1c296b01d0f6708409f3a9a69722192516bc514e31"

RPROVIDES:${PN} += "hdf5-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-mvapich2 \
libhdf5-310-mvapich2 \
libhdf5-cpp310-mvapich2 \
libhdf5-fortran310-mvapich2 \
libhdf5-hl-cpp310-mvapich2 \
libhdf5-hl-fortran310-mvapich2 \
libhdf5-hl310-mvapich2 \
libhdf5-tools310-mvapich2 \
zlib-devel"

inherit rpm
