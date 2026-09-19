SUMMARY = "Development files for pnetcdf-mpich"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mpich version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mpich-devel-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "a9533d8ad21c537c014bc6ec48ec3f96e91938de1b741626fbb65dfd64c833863af950e38cdd02214828d17e125c4e541cce6c3a3c6bc8f2e13ac6e32dc45597"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel \
pkgconfig-pnetcdf \
pnetcdf-mpich-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-mpich \
mpich-devel \
pnetcdf-devel-data"

inherit rpm
