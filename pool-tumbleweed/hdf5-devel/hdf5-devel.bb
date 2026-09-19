SUMMARY = "Development files for hdf5"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the serial version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "hdf5-devel-1.14.6-2.7.aarch64.rpm"
RPM_HASH = "dca38b0d7898fca8274d5418678d129bfbae634652d96b9bb034e447b3dd56747f62b17e89985482da2627a9b3b449ee5249e2f6cb964011bc1ec55b1cbdf349"

RPROVIDES:${PN} += "cmake-hdf5 \
hdf5-devel \
pkgconfig-hdf5 \
pkgconfig-hdf5-cpp \
pkgconfig-hdf5-fortran \
pkgconfig-hdf5-hl \
pkgconfig-hdf5-hl-cpp \
pkgconfig-hdf5-hl-fortran"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
hdf5 \
hdf5-devel-data \
libhdf5-310 \
libhdf5-cpp310 \
libhdf5-fortran310 \
libhdf5-hl-cpp310 \
libhdf5-hl-fortran310 \
libhdf5-hl310 \
libhdf5-tools310 \
zlib-devel"

inherit rpm
