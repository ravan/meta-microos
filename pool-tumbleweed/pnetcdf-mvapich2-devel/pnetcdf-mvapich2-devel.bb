SUMMARY = "Development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mvapich2-devel-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "2ae666a3033f75cd245e2c7b8b2ce64615edb3952e58e7c2ca4b7de90661949fb09fbc027ec6b8209205e9a20669b539926091672376b3a174d33aae48fff9cb"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel \
pkgconfig-pnetcdf \
pnetcdf-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mvapich2 \
mvapich2-devel \
pnetcdf-devel-data"

inherit rpm
