SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pytest-virtualenv-1.8.1-1.7.noarch.rpm"
RPM_HASH = "50e3ea766859443cac11387171fed115fb411d3f6f1ef7bce5fc048e9e7bcf7cd13ee3adbe3100a3d96a55c263b084ea4dc9653fc9fd0aded8bd7d43cbbeeafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-virtualenv \
python3.13dist-pytest-virtualenv \
python313-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python313-importlib-metadata \
python313-pytest \
python313-pytest-fixture-config \
python313-pytest-shutil"

inherit rpm
