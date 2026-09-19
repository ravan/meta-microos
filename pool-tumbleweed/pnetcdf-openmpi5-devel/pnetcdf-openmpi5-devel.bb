SUMMARY = "Development files for pnetcdf-openmpi5"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi5 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi5-devel-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "e2d29e8a2162e74cf7538abce33ad3bb8c99ab4dcf0fce7cde112e6ec79fbcd2a053f21546ba71146e91b5b6bee0d2c6da2a29484e638b4ad81714cb6f027f22"

RPROVIDES:${PN} += "parallel-netcdf-openmpi5-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi5 \
openmpi5-devel \
pnetcdf-devel-data"

inherit rpm
