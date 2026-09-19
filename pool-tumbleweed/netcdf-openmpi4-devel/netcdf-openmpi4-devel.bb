SUMMARY = "Development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi4-devel-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "3420094b6583b37584a24731a1ca9df9c466a94cb13acc23fbb5057725d9327f27a7d2442f66520445533f0521af4d5a0970951c3e24b44f9791741beaa73717"

RPROVIDES:${PN} += "netcdf-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi4-devel \
libcurl-devel \
libnetcdf22-openmpi4 \
netcdf-devel-data \
openmpi4-devel \
pkgconfig \
zlib-devel"

inherit rpm
