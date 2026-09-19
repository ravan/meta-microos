SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi5 version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi5-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "f16cd2112707178034a50e5bfbc0343cbfec48cafdbe16c5655d0c2ffa075f3620dd0c036eac83ed844c388903936f217dc0da7bf54ef3dd1581da1deafbc3ca"

RPROVIDES:${PN} += "parallel-netcdf-openmpi5 \
pnetcdf-openmpi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libpnetcdf.so.7 \
libpnetcdf4-openmpi5 \
openmpi5"

inherit rpm
