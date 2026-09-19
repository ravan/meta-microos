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

RPM_NAME = "postgresql16-timescaledb-2.30.0-1.1.aarch64.rpm"
RPM_HASH = "d994a5d7400dd7955dabb2e4f4bea589c1d66115088cb5aa8c99673fc563c002993632163aa34fa9185ebcb59b3be90c246d9df06b19e5befb1bd53f01cb37a0"

RPROVIDES:${PN} += "postgresql16-timescaledb \
postgresql16-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql16-server"

inherit rpm
