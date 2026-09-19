SUMMARY = "A simple pytest plugin to run tests concurrently"
DESCRIPTION = "A simple pytest plugin to run tests concurrently"
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-pytest-run-parallel-0.10.0-1.1.noarch.rpm"
RPM_HASH = "286a5d222063dd1e2a05b7bbe8a513ddb1a3d333a266e192cad5f139c9ef56837b57218a39f5180eb6126d43dd29b0051db2e2a8f2c5a01f7bb828fdf6b10b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-run-parallel \
python314-pytest-run-parallel \
python3dist-pytest-run-parallel"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
