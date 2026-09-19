SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python314-easypysmb-1.4.4-3.4.noarch.rpm"
RPM_HASH = "ba2da6b7a47760ae9c6f72f9b032e4b357f3820ab831a915058f3228e6f429051d67bda1d10d9cd6967516704568f1b51865dc33a6c07774272329abe46b68e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easypysmb \
python314-easypysmb \
python3dist-easypysmb"

RDEPENDS:${PN} += "python-abi \
python314-pysmb"

inherit rpm
