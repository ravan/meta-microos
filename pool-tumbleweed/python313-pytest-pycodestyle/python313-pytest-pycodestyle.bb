SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python313-pytest-pycodestyle-2.5.0-3.1.noarch.rpm"
RPM_HASH = "0a1407295a0f38547204a6ee646e3725ff6ebba2955fe2736ce0ca7d2eddabbff46018aee0fd6959884ed1a70d47381eac1f983cacddf024225b6e90c2e50aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-codestyle \
python3-pytest-pycodestyle \
python3.13dist-pytest-pycodestyle \
python313-pytest-codestyle \
python313-pytest-pycodestyle \
python3dist-pytest-pycodestyle"

RDEPENDS:${PN} += "python-abi \
python313-pycodestyle \
python313-pytest"

inherit rpm
