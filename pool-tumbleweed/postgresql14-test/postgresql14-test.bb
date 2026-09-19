SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-test-14.24-2.2.aarch64.rpm"
RPM_HASH = "90898c66cbf0ea7dce286cc6dcc29b84ca6acf6351bfa12d24000375767645cfd1d08cad42a7b745fff768ab4e054955e5bb4d7fab412416e174be51d172c328"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql14-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql14-server"

inherit rpm
