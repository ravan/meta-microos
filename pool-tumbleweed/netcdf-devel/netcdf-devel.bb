SUMMARY = "Development files for netcdf"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains all files needed to create projects that use NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-devel-4.10.1-1.2.aarch64.rpm"
RPM_HASH = "4487fdc7230f31bc26f0fdcf551d080ae91cb4bb57a1d0e48d83bd4b9a1dd5edd0dc8db810ae62b49798817d4dc11c4a943049bde7413744c436a8a37a9f3ea3"

RPROVIDES:${PN} += "netcdf-devel \
pkgconfig-netcdf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
hdf5-devel \
libcurl-devel \
libnetcdf22 \
netcdf-devel-data \
pkgconfig \
zlib-devel"

inherit rpm
