SUMMARY = "A simple network listener for pytest"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-listener-1.8.1-1.7.noarch.rpm"
RPM_HASH = "30b0255c109bfc549eb270b3594173fde31b45ef897831a3a949dfd7eb731a65f8b3e5919590a8a9f9bc1ab755f26a322e608002c5a0bf69d94cd6727168a42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-listener \
python3.13dist-pytest-listener \
python313-pytest-listener \
python3dist-pytest-listener"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-pytest-server-fixtures"

inherit rpm
