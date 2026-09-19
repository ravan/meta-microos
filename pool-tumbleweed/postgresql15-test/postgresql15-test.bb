SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-test-15.19-2.2.aarch64.rpm"
RPM_HASH = "2bedf5b941d7dc70ad58313eb2f2f31ba9ee19e7ebc620c2162485743e00e24ef615ed068f29919d54aaa2dc1ae5ac3d6417e730ffbf93b32e0e192fa9df9b29"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql15-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql15-server"

inherit rpm
