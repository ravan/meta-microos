SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python313-pytest-dotenv-0.5.2-2.5.noarch.rpm"
RPM_HASH = "3190d279e73a02a7f90bf17567a1d027184e6b9fb3fe07df37e66863d12a0accd34840ad3f70d0760fe87c6a081bc9b0120ab2402b970b7972d877726674e0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dotenv \
python3.13dist-pytest-dotenv \
python313-pytest-dotenv \
python3dist-pytest-dotenv"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-python-dotenv"

inherit rpm
