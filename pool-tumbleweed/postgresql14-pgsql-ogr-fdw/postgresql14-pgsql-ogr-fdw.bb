SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "postgresql14-pgsql-ogr-fdw-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "d8b058b5deb2a45f2c7b65ac4e90b2ffdb77d0f4dfd9b6fdf356f83d0a058eb08a733ef94eff75c7e0cadca8e562dee3d1eb5b05510da1b5536be3853ad7ecd1"

RPROVIDES:${PN} += "postgresql14-pgsql-ogr-fdw \
postgresql14-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
postgresql14-server"

inherit rpm
