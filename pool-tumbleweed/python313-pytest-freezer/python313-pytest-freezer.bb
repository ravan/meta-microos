SUMMARY = "Pytest plugin providing a fixture interface for spulec/freezegun"
DESCRIPTION = "Pytest plugin providing a fixture interface for freezegun. \
The fixture name is freezer. It is a freezegun.api.FrozenDateTimeFactory \
instance."
LICENSE = "MIT"

PV = "0.4.9"

RPM_NAME = "python313-pytest-freezer-0.4.9-2.7.noarch.rpm"
RPM_HASH = "d42f0b5957ecee00d030ff5de8694b78547e33ca555842c7473971253c0e1e1f570c679f88213b978d44c12e0eba8484d9793a7d0b3aaf814e6a7d9555e1e6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-freezer \
python3.13dist-pytest-freezer \
python313-pytest-freezer \
python3dist-pytest-freezer"

RDEPENDS:${PN} += "python-abi \
python313-freezegun \
python313-pytest"

inherit rpm
