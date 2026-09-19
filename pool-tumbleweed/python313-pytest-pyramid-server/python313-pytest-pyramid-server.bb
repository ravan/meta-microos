SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pytest-pyramid-server-1.8.0-1.8.noarch.rpm"
RPM_HASH = "76c2f6e102af1bda73e2138e5657f7b7c2bf7ab4f6b7a9ec7e594aaa61892abfe4f9d9b6182b14964703badf5d5b80d28e474b33e8157003da6ae4198e404bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pyramid-server \
python3.13dist-pytest-pyramid-server \
python313-pytest-pyramid-server \
python3dist-pytest-pyramid-server"

RDEPENDS:${PN} += "python-abi \
python313-pyramid \
python313-pytest \
python313-pytest-server-fixtures \
python313-waitress"

inherit rpm
