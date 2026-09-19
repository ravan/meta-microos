SUMMARY = "Static development files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi4 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi4-devel-static-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "8f0ba9388cbda1954e0b39ea7d1e865749ba77bb902db627ec6bbd696a17b4f06342438afd2d7bd253b8fe368b246af42bc6078965bc693251ae0785aab2048d"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel-static \
pnetcdf-openmpi4-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi4-devel"

inherit rpm
