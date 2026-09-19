SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-pluggy-1.6.0-2.7.noarch.rpm"
RPM_HASH = "410fba46586808a2e82f19619c10dd1d76933fcbc572beba668f4d4ab0398aff44416cf6f917ca31dccadc3508ed1d8e725c179ac0c4afbeafc92643f6c8c85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluggy \
python3.13dist-pluggy \
python313-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
