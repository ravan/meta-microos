SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-pytest-isort-4.0.0-3.6.noarch.rpm"
RPM_HASH = "8d222a077948e90354b7a1d0b39d9f2e448f7d718c6759f4e9d2091c9f48ba654598228fd6c16d35c94cf9dccdd442ca3bdbdfa4faca485d529e8baa552f4e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-isort \
python314-pytest-isort \
python3dist-pytest-isort"

RDEPENDS:${PN} += "python-abi \
python314-isort \
python314-pytest"

inherit rpm
