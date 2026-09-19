SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-server-fixtures-1.8.1-3.4.noarch.rpm"
RPM_HASH = "fb4b2b4e199af7d80fb791c0d4b43899a8da02f944266a9cd5e7f3a6c9ca0fa745e3c7518562118e7ffacc186f3ec8ab951fb733899797ca7843e4fad135e76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-server-fixtures \
python314-pytest-server-fixtures \
python3dist-pytest-server-fixtures"

RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python-abi \
python314-psutil \
python314-pytest \
python314-pytest-fixture-config \
python314-pytest-shutil \
python314-requests \
python314-retry"

inherit rpm
