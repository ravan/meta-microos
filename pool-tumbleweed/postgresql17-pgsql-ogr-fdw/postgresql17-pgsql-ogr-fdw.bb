SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "postgresql17-pgsql-ogr-fdw-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "2affa76d69ac04ddcbb911bfd2bf1445c4555e8e431e7046b3dc05df6a0af102dc731bca2479ceac82c1332bbb3c6aeccda99cb9a07482ecd502a1a54e3949e7"

RPROVIDES:${PN} += "postgresql17-pgsql-ogr-fdw \
postgresql17-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
postgresql17-server"

inherit rpm
