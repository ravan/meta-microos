SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-server-fixtures-1.8.1-3.4.noarch.rpm"
RPM_HASH = "a8ec10be600497571e7b64f3791ac78929b05f2ee32f0b3fe8cedefef90b9ebb78654125991a80f85b8bd6ae7058d4c87125b5d8e9096d2d0174e9351a375ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-server-fixtures \
python3.13dist-pytest-server-fixtures \
python313-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python313-psutil \
python313-pytest \
python313-pytest-fixture-config \
python313-pytest-shutil \
python313-requests \
python313-retry"

inherit rpm
