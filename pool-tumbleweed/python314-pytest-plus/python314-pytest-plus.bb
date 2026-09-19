SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-pytest-plus-0.8.1-1.4.noarch.rpm"
RPM_HASH = "e6fd33c89d4481d26848164c9db29e6d60b7797c772a907132b3f61f0a1bdbcd207503c3ce09afa6d286b549ccb24bff41b954c0076af6d0cf45c9e546d1f06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-plus \
python314-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
