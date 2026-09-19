SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-test-18-3.4.noarch.rpm"
RPM_HASH = "4606b1bb490769f2a687162101144aed0bfe2dac0531ff7b96189944038ef10092b509a6048b4f8b1b5b5fa9c7b4e745b7536e9befc7b7f6e79e6cdb6a3a9b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-test \
postgresql-test-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-noarch \
postgresql-test-implementation"

inherit rpm
