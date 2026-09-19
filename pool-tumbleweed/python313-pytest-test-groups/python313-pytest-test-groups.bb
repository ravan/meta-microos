SUMMARY = "Pytest plugin to split your tests into equally sized groups"
DESCRIPTION = "A Pytest plugin for running a subset of your tests by splitting them in to equally sized groups."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-pytest-test-groups-1.2.1-1.4.noarch.rpm"
RPM_HASH = "c2a81fd8d2f45a31d14cbb2859520c00aa8801c6b1cf7cfbe6d51ca0e76b254f084aaba21bd68b82fca38b6ff98d4c917ab5244f123b245878c69f0bed34866e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-test-groups \
python3.13dist-pytest-test-groups \
python313-pytest-test-groups \
python3dist-pytest-test-groups"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
