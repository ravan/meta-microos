SUMMARY = "Development files for netcdf-openmpi5"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi5 version of all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi5-devel-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "251071166e1c65461ceccad1ea7b0541de2a94f2ad26e5107604dbbe614d4c59fe9c756369d8d56e669fae94a8424eeb4c505027659e4e20627d681ad58fb7a2"

RPROVIDES:${PN} += "netcdf-openmpi5-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-openmpi5-devel \
libcurl-devel \
libnetcdf22-openmpi5 \
netcdf-devel-data \
openmpi5-devel \
pkgconfig \
zlib-devel"

inherit rpm
