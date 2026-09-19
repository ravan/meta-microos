SUMMARY = "PostgreSQL OGR Foreign Data Wrapper"
DESCRIPTION = "OGR is the vector half of the GDAL spatial data access library. \
It allows access to a large number of GIS data formats using a simple C API for data reading and writing. \
Since OGR exposes a simple table structure and PostgreSQL foreign data wrappers allow access to table structures, the fit seems pretty perfect."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "postgresql16-pgsql-ogr-fdw-1.1.9-1.2.aarch64.rpm"
RPM_HASH = "59881e32253941159cf1b79b9831064626e93a8056e96b66167961e15b9cd0207033d34bb7cc8967314eba65762e660354046d14f440538b2c92a8cefd2836a9"

RPROVIDES:${PN} += "postgresql16-pgsql-ogr-fdw \
postgresql16-pgsql-ogr-fdw-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdal.so.39 \
postgresql16-server"

inherit rpm
