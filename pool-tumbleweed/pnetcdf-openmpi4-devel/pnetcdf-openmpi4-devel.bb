SUMMARY = "Development files for pnetcdf-openmpi4"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-openmpi4-devel-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "a32e254a0f4fab9c9803a8e17ae7a611c07f4699e10b291266413b8246ab2f6c0defa90e59d99dbfdb348c1ee1e57dc7e5325248cfc128ee0e37243c5f7f5251"

RPROVIDES:${PN} += "parallel-netcdf-openmpi4-devel \
pkgconfig-pnetcdf \
pnetcdf-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpnetcdf4-openmpi4 \
openmpi4-devel \
pnetcdf-devel-data"

inherit rpm
