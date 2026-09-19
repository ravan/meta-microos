SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
Parallel netCDF (PnetCDF) is a library providing high-performance I/O while \
still maintaining file-format compatibility with NetCDF by Unidata. \
 \
This package contains the openmpi4 version of utility functions for \
working with NetCDF files."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi4-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "7ae4b1151709f165b941cb31f364ecbb015e1f87d5103043685c9a4c3250deb532a413f8d6649ca52aac52feb10fc8017ed84c9700c4451fbd0883dc1fa6f39f"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4 \
pnetcdf-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
libpnetcdf.so.7 \
libpnetcdf4-openmpi4 \
openmpi4"

inherit rpm
