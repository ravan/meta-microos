SUMMARY = "Backend used by PDM"
DESCRIPTION = "The build backend used by [PDM] that supports latest packaging standards."
LICENSE = "MIT"

PV = "2.4.9"

RPM_NAME = "python313-pdm-backend-2.4.9-1.2.noarch.rpm"
RPM_HASH = "a63673531b98572188e47ea3fd3e9d2db3fefe30e43f02edcdf4a7e1736546c51fdde2f36ebed36789866eadb44fc440c8cd9cf6bc3e2072211f3b2987f5fa5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm-backend \
python3.13dist-pdm-backend \
python313-pdm-backend \
python3dist-pdm-backend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
