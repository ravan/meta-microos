SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-test-17.11-2.2.aarch64.rpm"
RPM_HASH = "e941a9158d6e6d569ac7de63b532f6d5082a5b698eb5872ca058f234e6e0bff9e5eece6b1838e99a08e04c526f932f872b4a2ebc9772d78ad1543fd5b8bd2722"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql17-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql-test-noarch \
postgresql17-server"

inherit rpm
