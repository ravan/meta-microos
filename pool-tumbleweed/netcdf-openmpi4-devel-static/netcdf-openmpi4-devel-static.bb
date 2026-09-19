SUMMARY = "Static development files for netcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and self-describing, \
machine-independent data formats that support the creation, access, \
and sharing of array-oriented scientific data. \
 \
This package contains the openmpi4 version of the static libraries for NetCDF."
LICENSE = "NetCDF"

PV = "4.10.1"

RPM_NAME = "netcdf-openmpi4-devel-static-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "f05ba5a8fc5c7260c65fd34f48317b3538a31a4df6832c098de1ecdc58a28a9a8ffab3f189df407c5e98e195f4da32f24c138d343afbbf3deeabb006db4b3170"

RPROVIDES:${PN} += "netcdf-openmpi4-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi4-devel \
libcurl-devel \
zlib-devel"

inherit rpm
