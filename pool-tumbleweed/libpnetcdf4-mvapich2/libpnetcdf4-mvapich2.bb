SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "libpnetcdf4-mvapich2-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "3cd1d77352ea5226e02f0c246a0428a02958df8b7d3a99609460b8e59ac681ad1f7b3bbfa0ef67494ba483e20be56cfd22085b231cd72a9289cc2ef379949733"

RPROVIDES:${PN} += "libpnetcdf-mvapich2 \
libpnetcdf.so.7 \
libpnetcdf4-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
