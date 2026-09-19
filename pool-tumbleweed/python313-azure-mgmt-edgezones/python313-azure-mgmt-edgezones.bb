SUMMARY = "Microsoft Azure Edgezones Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgezones Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-edgezones-1.0.0-1.1.noarch.rpm"
RPM_HASH = "730c7dde5cf9c7e31af231fbbd91cbab95d68c859f39f5ccb408f9c01eb8b73a5f3178be5f928705d67b7fd8436c5762f72bb8009320af8bc45e493e031f18fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgezones \
python3.13dist-azure-mgmt-edgezones \
python313-azure-mgmt-edgezones \
python3dist-azure-mgmt-edgezones"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
