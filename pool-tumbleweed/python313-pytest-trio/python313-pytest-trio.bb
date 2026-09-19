SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python313-pytest-trio-0.8.0-5.5.noarch.rpm"
RPM_HASH = "ac79cebf5e5ec0db1411c9edc1403728d5a86a65dab70769a9fafa6a4c7a6bec2aeff9e23cbb67b2e68842966136c9e24e55d2c612f8691fbb1b19195655c48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-trio \
python3.13dist-pytest-trio \
python313-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python313-outcome \
python313-pytest \
python313-trio"

inherit rpm
