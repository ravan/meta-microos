SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-pytest-percent-0.1.2-2.5.noarch.rpm"
RPM_HASH = "fd157456f05b02685940b750fa111bcbe9f6f98aea341a4ef41596ef4503e5d4add4e8c7bd859e10dd04b1ba559fea9be731812c0ebc22cc333f278adf5eb0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-percent \
python3.13dist-pytest-percent \
python313-pytest-percent \
python3dist-pytest-percent"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
