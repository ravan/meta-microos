SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pytest-pyramid-server-1.8.0-1.8.noarch.rpm"
RPM_HASH = "6db0aa462fc44233e6c56e5dc77f7fb7b69516d76d1e38ea3510e4938f32653e4ba3e4c62a2d7335acaf879d50c22ce0020b1b09a1fda1eaf26a59aebc1f96e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-pyramid-server \
python314-pytest-pyramid-server \
python3dist-pytest-pyramid-server"

RDEPENDS:${PN} += "python-abi \
python314-pyramid \
python314-pytest \
python314-pytest-server-fixtures \
python314-waitress"

inherit rpm
