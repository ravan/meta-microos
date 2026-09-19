SUMMARY = "Static development files for netcdf-openmpi5"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi5 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi5-devel-static-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "d2aeb8d0dbdb8a7ac466c8733da123bb09f9f38ee25275ac95969b85754e7c5d46b8e8a944a3ac65fb8c9319f783d1fabc03817e8f267a6c8517e3d92121ddc1"

RPROVIDES:${PN} += "netcdf-openmpi5-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi5-devel \
libcurl-devel \
zlib-devel"

inherit rpm
