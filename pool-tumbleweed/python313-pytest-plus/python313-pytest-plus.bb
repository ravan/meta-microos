SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python313-pytest-plus-0.8.1-1.4.noarch.rpm"
RPM_HASH = "fdc53cb79aa3078f3409986ec6fbc77a76b389d6dfb75196c6f96f0e1920876f63772f2b3ec27ea80d997fa565ccbc076c4a4cfcaad5f3703944d335facd2f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-plus \
python3.13dist-pytest-plus \
python313-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
