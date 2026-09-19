SUMMARY = "A hatchling plugin for Tryton"
DESCRIPTION = "A ``hatchling`` plugin to manage Tryton dependencies."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-hatch-tryton-0.1.1-1.3.noarch.rpm"
RPM_HASH = "f0d2a443f660a08fb5af454ea9f4e9e2a16af90d32d3763fb128c305783cff448ed0dc4a918ec56f9d8e47f74a7d508c130eadf2b1ea0e95f64a67b9626f7e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-tryton \
python3.13dist-hatch-tryton \
python313-hatch-tryton \
python3dist-hatch-tryton"

RDEPENDS:${PN} += "python-abi \
python313-hatchling"

inherit rpm
