SUMMARY = "A hatchling plugin for Tryton"
DESCRIPTION = "A ``hatchling`` plugin to manage Tryton dependencies."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-hatch-tryton-0.1.1-1.3.noarch.rpm"
RPM_HASH = "ae914b05c92058dfe01745d0d2daa44665eb3e8d7e4df74bdd0be6cf53f24cc684117105e70ca7473e6df1df49f087b51af3a36b96135a35a110e0ca2551d4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-tryton \
python314-hatch-tryton \
python3dist-hatch-tryton"

RDEPENDS:${PN} += "python-abi \
python314-hatchling"

inherit rpm
