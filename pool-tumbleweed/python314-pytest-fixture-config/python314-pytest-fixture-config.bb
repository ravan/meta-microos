SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-pytest-fixture-config-1.8.0-2.9.noarch.rpm"
RPM_HASH = "4441c547641d7ce64ea590173d78c3d53e582c8e6c3eac881791b0d02b47c8c0f5458c3feb666fe92cb6c7016b809bfa9fe3fd3f051c8067d2c750617ddf1e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-fixture-config \
python314-pytest-fixture-config \
python3dist-pytest-fixture-config"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
