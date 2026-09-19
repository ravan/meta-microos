SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-pytest-fixture-config-1.8.0-2.9.noarch.rpm"
RPM_HASH = "e2835a3cf349c8f0736f7a13d8acff62ba6519c7f810360b9d3d085aeecc6036480fce6c9106818ef2149dc08152d500a4aff7851abac6073108d76c20ec991e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-fixture-config \
python3.13dist-pytest-fixture-config \
python313-pytest-fixture-config \
python3dist-pytest-fixture-config"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
