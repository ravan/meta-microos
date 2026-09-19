SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python314-pyproject-api-1.10.0-1.6.noarch.rpm"
RPM_HASH = "862ef037de6bc3cb93c9c61918effbb34303a1e7fdfa2dbebd780eded6ce8bb6df204887cc0d4680cdc769778e692ebc23e2c9949eb93a54acc5b06e5f520ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyproject-api \
python314-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
