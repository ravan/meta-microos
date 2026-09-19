SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-test-18.6-1.2.aarch64.rpm"
RPM_HASH = "456e06b4c3ea39dc762d6f52ae4ede69d1a673fdbe632b0c08ba20b5b06d22cb4aebe78dc283a80e1819911860cdbc0773c5d785e3e925f7ebe9288690f851cf"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql18-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql-test-noarch \
postgresql18-server"

inherit rpm
