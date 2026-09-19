SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python313-pytest-testconfig-0.2.0-2.5.noarch.rpm"
RPM_HASH = "305a7e3d96fc9d371980e568d037c9787314a526279ee7835a8d97a9564e76baece7030100304eb9c96b8ed0cbfca189f003acfd4fb2cc5ceed36255e474bbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testconfig \
python3.13dist-pytest-testconfig \
python313-pytest-testconfig \
python3dist-pytest-testconfig"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
