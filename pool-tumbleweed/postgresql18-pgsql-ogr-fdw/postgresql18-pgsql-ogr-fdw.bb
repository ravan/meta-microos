SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "postgresql18-pgsql-ogr-fdw-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "619b3cb4b5b34373967af38c440c00e78a291e989ac2126369553d9e78f10c28fca3bc23f407bab75244a9273b744f9d8fd3d38fc2e553e6f7ef2352ad6b3b24"

RPROVIDES:${PN} += "postgresql18-pgsql-ogr-fdw \
postgresql18-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
postgresql18-server"

inherit rpm
