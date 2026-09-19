SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python314-pytest-testconfig-0.2.0-2.5.noarch.rpm"
RPM_HASH = "0fd75b348cec69f29245fc05db0952520f9930deaed5e5f668972169d70d4248467d1cfa8f0fd7fb1756908233886e0d706e2cb02c96db0c2ed9fe29f019b82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-testconfig \
python314-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
