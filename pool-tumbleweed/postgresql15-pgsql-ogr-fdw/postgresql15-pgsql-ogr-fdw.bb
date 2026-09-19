SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "postgresql15-pgsql-ogr-fdw-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "21270b7a75ef6999a60c73c77d847e261e998824a75027c4fb2ff245a1bf3ec9c8418e8a89b88ee5dd3a0462c66ef20a975ee295b24919027ef6f0af042dc22a"

RPROVIDES:${PN} += "postgresql15-pgsql-ogr-fdw \
postgresql15-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
postgresql15-server"

inherit rpm
