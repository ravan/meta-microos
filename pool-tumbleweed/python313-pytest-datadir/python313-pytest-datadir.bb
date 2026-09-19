SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pytest-datadir-1.8.0-1.5.noarch.rpm"
RPM_HASH = "29c6d231e3ca5a603b593a43f4dd66a177e8c51a9b19cab2a067b9e036e28f63d009337c9a2d4b3d57c0809152da95ed98afe3b3dc9fbca07ba463618dae0669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-datadir \
python3.13dist-pytest-datadir \
python313-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
