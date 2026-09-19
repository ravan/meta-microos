SUMMARY = "Backend used by PDM"
DESCRIPTION = "The build backend used by [PDM] that supports latest packaging standards."
LICENSE = "MIT"

PV = "2.4.9"

RPM_NAME = "python314-pdm-backend-2.4.9-1.2.noarch.rpm"
RPM_HASH = "9ec8814d62199195be1e72e265d0f0d15e06682753858b66e8f35264e24c9bedbba80611241ae53adb6a696232f172c160950d4c8ac90c6679289b5880eb382c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pdm-backend \
python314-pdm-backend \
python3dist-pdm-backend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
