SUMMARY = "A time-series database extension for PostgreSQL"
DESCRIPTION = "TimescaleDB is a database for making SQL more scalable for \
time-series data. It is engineered up from PostgreSQL, providing \
automatic partitioning across time and space (partitioning key), as \
well as full SQL support. \
 \
TimescaleDB is packaged as a PostgreSQL extension. \
 \
This build includes only Apache2 modules; \
TSL (timescale licenced modules are not built)."
LICENSE = "Apache-2.0"

PV = "2.30.0"

RPM_NAME = "postgresql17-timescaledb-2.30.0-1.1.aarch64.rpm"
RPM_HASH = "f8af20612c20019ce8c7b340952af6eae03d59524fb3c9124cbc4bfee889e81ba2441f88ca10d13be7fa60a3625c70fd8521f26d1cd30a040b05beae4bbc2cd2"

RPROVIDES:${PN} += "postgresql17-timescaledb \
postgresql17-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql17-server"

inherit rpm
