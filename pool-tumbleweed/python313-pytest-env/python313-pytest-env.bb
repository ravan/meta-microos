SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-pytest-env-1.6.0-1.5.noarch.rpm"
RPM_HASH = "021d972e6e53b3f9f9fa2384d2b5cfeeb448072e05f9a7623e7a597cc65f6bb7cd502fb925f4ebac0a6d277a830df0730fad960399bed4180abba8b8d164cbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-env \
python3.13dist-pytest-env \
python313-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-python-dotenv"

inherit rpm
