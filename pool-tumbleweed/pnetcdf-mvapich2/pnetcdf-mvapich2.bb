SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mvapich2 version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mvapich2-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "4c7c4d20e3a86f1ec43198bec5d40b54bc3b2c790512fe3e5b2d7961c084d8858259c18fe38ae9e5fcbfb66e7a9671466b96d1138dad906c0eb3cc1cde07647f"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2 \
pnetcdf-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.7 \
libpnetcdf4-mvapich2 \
mvapich2"

inherit rpm
