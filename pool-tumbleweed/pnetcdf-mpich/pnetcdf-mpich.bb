SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the mpich version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mpich-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "59dd9a30cdb580b2cf28244cb2a22dab2ce644b90299d722db19f97ae0f9388f05d2ec90dc326f284f47f7ac9bfc7ea8df0262f23e1faf4a10454379931565cd"

RPROVIDES:${PN} += "parallel-netcdf-mpich \
pnetcdf-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libpnetcdf.so.7 \
libpnetcdf4-mpich \
mpich"

inherit rpm
