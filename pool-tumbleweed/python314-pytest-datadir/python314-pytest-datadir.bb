SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pytest-datadir-1.8.0-1.5.noarch.rpm"
RPM_HASH = "ae6df8f25b5ead75d148e39f3a8979bb32e03dfcef87f74db05e0af0a0f74279785f1ba00878968c3c5a4f62364885c32f9b0611d32d07f6e249fca6f9f59af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-datadir \
python314-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
