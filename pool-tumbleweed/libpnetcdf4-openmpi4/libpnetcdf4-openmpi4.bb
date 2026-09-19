SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi4 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "libpnetcdf4-openmpi4-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "d352c33a5829a930d93ba3cafbc851a2e479ed1a44e6a15c8d469309cb14f968c4c2bb11a7cda986915b43aad92c7ff2d1e2aeebd66e1cb3d7b3198bf1f01acf"

RPROVIDES:${PN} += "libpnetcdf-openmpi4 \
libpnetcdf.so.7 \
libpnetcdf4-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
