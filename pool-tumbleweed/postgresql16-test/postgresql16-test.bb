SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-test-16.15-2.2.aarch64.rpm"
RPM_HASH = "22279913a432f3d87368c0deb865352f66f07cb9717b1d2eb016986ccd278a11189d61b545ea3305a6c22a097e01356c453ed0e66bdeae85029c0e31e32ddeb3"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql16-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql16-server"

inherit rpm
