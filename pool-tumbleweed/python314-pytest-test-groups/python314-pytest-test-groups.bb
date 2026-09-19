SUMMARY = "Pytest plugin to split your tests into equally sized groups"
DESCRIPTION = "A Pytest plugin for running a subset of your tests by splitting them in to equally sized groups."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-pytest-test-groups-1.2.1-1.4.noarch.rpm"
RPM_HASH = "1b60ea5ee64f7dead333dc32e7895743d031f0f767228a9866f342cf3b6ce0f24aeb0ef836557cd11f87d81004a1fa4b5cdd33f27415f7b3b22b997730eb396a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-test-groups \
python314-pytest-test-groups \
python3dist-pytest-test-groups"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
