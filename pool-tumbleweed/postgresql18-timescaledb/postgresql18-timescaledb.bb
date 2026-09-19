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

RPM_NAME = "postgresql18-timescaledb-2.30.0-1.1.aarch64.rpm"
RPM_HASH = "843b5afc5ff37781926f0df00bdc9d3e5787bdf42d5bd1a420fc9c084a61d158faa077f80a36ddf004ec1e9f1e9a2123c1415a6a786c807a01d37d12e025a255"

RPROVIDES:${PN} += "postgresql18-timescaledb \
postgresql18-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql18-server"

inherit rpm
