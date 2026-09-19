SUMMARY = "GDAL netCDF driver plugin"
DESCRIPTION = "GDAL loadable driver plugin for the netCDF raster/multidimensional format."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-netcdf-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "39a8bac83f18bf6cd0492667ad7b69085741e9715868e47bcbfb5bb7d4e8bf66428501164368f7d292f60f6a06852a78f9e4041ac3a7dbeaaaf4fe79f73aaef8"

RPROVIDES:${PN} += "gdal-netcdf"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libnetcdf.so.22 \
libstdc++.so.6"

inherit rpm
