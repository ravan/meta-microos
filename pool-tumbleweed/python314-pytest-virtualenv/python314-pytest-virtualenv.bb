SUMMARY = "Virtualenv fixture for pytest"
DESCRIPTION = "Create a Python virtual environment in your test that cleans up on \
teardown. The fixture has utility methods to install packages and list \
what's installed."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-virtualenv-1.8.1-1.7.noarch.rpm"
RPM_HASH = "2bf0020d60a9f168ebe52048df277e6c25c1742e6a5463042f625d570dcaa4e606d60781a38c2567fb6711552538ce1d480bceacfe4100ea4326cb6ff75e4b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-virtualenv \
python314-pytest-virtualenv \
python3dist-pytest-virtualenv"

RDEPENDS:${PN} += "python-abi \
python314-importlib-metadata \
python314-pytest \
python314-pytest-fixture-config \
python314-pytest-shutil"

inherit rpm
