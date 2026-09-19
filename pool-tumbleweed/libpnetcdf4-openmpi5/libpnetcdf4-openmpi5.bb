SUMMARY = "High-performance parallel I/O with the NetCDF scientific data format"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the openmpi5 version of the PnetCDF runtime \
libraries."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "libpnetcdf4-openmpi5-1.14.1-1.3.aarch64.rpm"
RPM_HASH = "a277a502639b3e452b5367b9b793b09a010686c511fbaa7335cc6b0e79eaee0311fc6369ddfecd1b365a62c65b31b2502ba272abf11ecfd2292fee2e69f19b1e"

RPROVIDES:${PN} += "libpnetcdf-openmpi5 \
libpnetcdf.so.7 \
libpnetcdf4-openmpi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
