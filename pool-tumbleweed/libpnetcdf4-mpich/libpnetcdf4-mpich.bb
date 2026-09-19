SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "libpnetcdf4-mpich-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "6e55c6bc7b8d7f08e77923bc12cb19110a9aaa186c5df8e6e1ebc92e743915d02eb3447cc19d527408756e608b93fd9f0b96c9eb4ce803f53ec0dc9b4e3f55cb"

RPROVIDES:${PN} += "libpnetcdf-mpich \
libpnetcdf.so.7 \
libpnetcdf4-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
