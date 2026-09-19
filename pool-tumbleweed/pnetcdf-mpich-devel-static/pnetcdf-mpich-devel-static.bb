SUMMARY = "Static development files for pnetcdf-mpich"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mpich versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mpich-devel-static-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "fd30a92539c53148690cb6487c12cc7cd77daff835fcd861c96e3a6fbc450a71f0689ccf23fc8566dc2097447cded6879d11ce0ec873d91850e07485c4b42449"

RPROVIDES:${PN} += "parallel-netcdf-mpich-devel-static \
pnetcdf-mpich-devel-static"

RDEPENDS:${PN} += "pnetcdf-mpich-devel"

inherit rpm
