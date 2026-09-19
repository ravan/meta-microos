SUMMARY = "GDAL PostgreSQL/PostGIS driver plugin"
DESCRIPTION = "GDAL/OGR loadable driver plugins for PostgreSQL/PostGIS: the OGR PostgreSQL \
vector driver and the PostGISRaster raster driver."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-postgresql-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "a19a1f25de569e52184735d6122636fb1c9e0bfc46ab6af426553ad5dfb619f90b869b4335dc86b93d93aced1c9c0a016635b81844f2c188ba4bf9db8a84cbc8"

RPROVIDES:${PN} += "gdal-postgresql"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
