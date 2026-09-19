SUMMARY = "Static development files for pnetcdf-openmpi5"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi5 versions of the static libraries for \
PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi5-devel-static-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "ba54921a414517c66b78866e23fb1a8eb2e97284b1ac53a21c41fcfa0d5b91116e7978dfea50d970318d90b74b0d07579268b5755ec36288241f7171dd4d379c"

RPROVIDES:${PN} += "parallel-netcdf-openmpi5-devel-static \
pnetcdf-openmpi5-devel-static"

RDEPENDS:${PN} += "pnetcdf-openmpi5-devel"

inherit rpm
