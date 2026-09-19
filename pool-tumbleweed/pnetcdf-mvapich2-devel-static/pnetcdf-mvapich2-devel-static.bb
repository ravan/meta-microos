SUMMARY = "Static development files for pnetcdf-mvapich2"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the mvapich2 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-mvapich2-devel-static-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "e2209847b54ddc289700cce7860ba8759bef076b17562be48ac1c5b39d596a549e6264849ce0c6dbade29321ee0524ecc479da1882e553290cef3d866992778b"

RPROVIDES:${PN} += "parallel-netcdf-mvapich2-devel-static \
pnetcdf-mvapich2-devel-static"

RDEPENDS:${PN} += "pnetcdf-mvapich2-devel"

inherit rpm
