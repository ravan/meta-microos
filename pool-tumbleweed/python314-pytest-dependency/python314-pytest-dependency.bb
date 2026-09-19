SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python314-pytest-dependency-0.6.1-1.2.noarch.rpm"
RPM_HASH = "6b8e7d36ad08f77b5acb7ec254bfc4938473e3f6fbd3198ef442434b361d1a9ca14a9931d22910bfea3ca47eed3292d175727013debd36acc4a92397a013559d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-dependency \
python314-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
